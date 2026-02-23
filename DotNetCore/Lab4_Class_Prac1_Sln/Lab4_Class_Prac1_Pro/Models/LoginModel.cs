using System.ComponentModel.DataAnnotations;

namespace Lab4_Class_Prac1_Pro.Models
{
    public class LoginModel
    {
        [Required(ErrorMessage = "Write your username")]
        [StringLength(5)]
        public string Username { get; set; }

        [Required]
        [StringLength(20, MinimumLength=8)]
        public string Password { get; set; }


    }
}
