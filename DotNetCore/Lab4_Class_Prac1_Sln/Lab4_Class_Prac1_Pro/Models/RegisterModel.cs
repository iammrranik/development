using System.ComponentModel.DataAnnotations;

namespace Lab4_Class_Prac1_Pro.Models
{
    public class RegisterModel
    {
        [Required]
        [StringLength(5)]
        public string Username { get; set; }

        [Required]
        [StringLength(25)]
        public string Name { get; set; }

        [Required]
        [EmailAddress]
        public string Email { get; set; }

        [Required]
        [StringLength(20, MinimumLength = 8)]
        public string Password { get; set; }

        [Required]
        public string Gender { get; set; }

        [Required]
        public string Department { get; set; }

        [Required]
        public string Hobbies { get; set; }

        [Range(1,100)]
        public int Id { get; set; }

    }
}
