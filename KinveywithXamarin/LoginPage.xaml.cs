using System;
using System.Collections.Generic;
using Acr.UserDialogs;
using KinveywithXamarin.Services;
using Xamarin.Forms;

namespace KinveywithXamarin
{
    public partial class LoginPage : ContentPage
    {
        private Lazy<IAuthService> lazyAuthService = new Lazy<IAuthService>(() => DependencyService.Get<IAuthService>());
        private IAuthService authService
        {
            get
            {
                return lazyAuthService.Value;
            }
        }

        public LoginPage()
        {
            InitializeComponent();
        }

        protected override void OnAppearing()
        {
            //if (dataService.ActiveUserExists())
            //{
            //    Navigation.PushAsync(new MainPage());
            //}
        }
        async void login(object sender, EventArgs e)
        {
            try
            {
                var user = await authService.LoginUser(username.Text,password.Text) ;
                UserDialogs.Instance.Toast("User " + user + " logged in");
                await Navigation.PushAsync(new BookViewPage());
            }
            catch (Exception error)
            {
                await DisplayAlert("Login failure", error.Message, "OK");
            }
        }
        async void register(object sender, EventArgs e)
        {
            try
            {
                var user1 = await authService.RegisterUser(username.Text,password.Text);
                UserDialogs.Instance.Toast("User " + user1 + " registered");
                await Navigation.PushAsync(new BookViewPage());
            }
            catch (Exception error)
            {
                await DisplayAlert("Register failure", error.Message, "OK");
            }
        }

        async void logout(object sender, EventArgs e)
        {
            try
            {
                authService.LogoutUser();
                UserDialogs.Instance.Toast("User logged out successfully");
            }
            catch (Exception error)
            {
                await DisplayAlert("Logout failure", error.Message, "OK");
            }
        }
    }
}