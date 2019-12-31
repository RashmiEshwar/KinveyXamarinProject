using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Kinvey;
using KinveywithXamarin.Models;

namespace KinveywithXamarin.Services
{
    public class KinveyBookService:IBooksService
    {
        private Client kinveyClient;
        private const string booksCollection = "books";
        DataStore<Models.Book> bookstore;

        public KinveyBookService()
        {
            kinveyClient = KinveyService.Instance().kinveyClient;
            bookstore = DataStore<Models.Book>.Collection(booksCollection, DataStoreType.AUTO);
        }

        public async Task<List<Book>> FindAsync(string searchText, int skip)
        {
            var q = bookstore
                .OrderByDescending(x => x.ID)
                .Skip(skip)
                .Take(50);

            if (!string.IsNullOrEmpty(searchText))
                q = (System.Linq.IOrderedQueryable<Models.Book>)bookstore.Where(x => x.Title.StartsWith(searchText, StringComparison.Ordinal));

            try
            {
                return await bookstore.FindAsync(q);
            }
            catch (KinveyException e)
            {
                throw new System.Exception(e.Message);
            }
        }
        public async Task SaveItem(Book updatedBook)
        {
            try
            {
                var book = await bookstore.SaveAsync(updatedBook);
            }
            catch (KinveyException ke)
            {
                throw new Exception(ke.Message);
            }
        }

        public async Task DeleteItem(Book itemToDelete)
        {
            try
            {
                await bookstore.RemoveAsync(itemToDelete.ID);
            }
            catch (KinveyException ke)
            {
                throw new Exception(ke.Message);
            }
        }
    }
}

