using System;
using Kinvey;

namespace KinveywithXamarin.Services
{
    public class KinveyService
    {
        private const string appKey = "kid_r1MKta2TB";
        private const string appSecret = "dd670164043d4f71be17f547db854936";

        public Client kinveyClient;

        private static KinveyService _instance;

        protected KinveyService()
        {
            var builder = new Client.Builder(appKey, appSecret)
                        .setLogger(Console.WriteLine);

            kinveyClient = builder.Build();
        }

        public static KinveyService Instance()
        {
            if (_instance == null)
            {
                _instance = new KinveyService();
            }

            return _instance;
        }

    }
}


