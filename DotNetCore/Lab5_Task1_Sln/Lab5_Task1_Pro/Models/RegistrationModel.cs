using System.ComponentModel.DataAnnotations;

namespace Lab5_Task1_Pro.Models
{
    public class AgeValidateAttribute : ValidationAttribute
    {
        public override bool IsValid(object value)
        {
            var dob = (DateTime)value;
            if (dob.Year > DateTime.Now.Year)
            {
                ErrorMessage = "Date of Birth cannot be in the future.";
                return false;
            }else if ( DateTime.Now.Year - dob.Year <= 20)
            {
                ErrorMessage = "You must be older than 20 years.";
                return false;
            }
            return true;
        }
    }

    public class RegistrationModel
    {
        [Required]
        [RegularExpression(@"^[A-Za-z .-]+$",
            ErrorMessage = "Allowed characters are only alphabets, space, dot and dash.")]
        public string Name { get; set; }

        [Required]
        [RegularExpression(@"^\d{2}-\d{5}-\d{1}$",
            ErrorMessage = "Must follow AIUB ID Format XX-XXXXX-XX")]
        public string Id { get; set; }

        [Required]
        [AgeValidate]
        public DateTime Dob { get; set; }

        [Required]
        [EmailAddress]
        public string Email { get; set; }


    }
}
