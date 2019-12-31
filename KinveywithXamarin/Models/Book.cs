using System;
using Newtonsoft.Json;

namespace KinveywithXamarin.Models
{
    public class Book : Kinvey.Entity
    {
        [JsonProperty("title")]
        public string Title { get; set; }

        [JsonProperty("author")]
        public string Author { get; set; }


        [JsonProperty("language")]
        public string Language { get; set; }

        [JsonProperty("country")]
        public string Country { get; set; }


        [JsonProperty("year")]
        public short Year { get; set; }

    }
}