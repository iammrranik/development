using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VehiclePro
{
    internal class Car : Vehicle
    {
        private short topSpeed;

        internal short TopSpeed
        {
            get { return this.topSpeed; }
            set { this.topSpeed = value; }
        }

        internal Car(string registrationNumber, RegistrationDate registrationDate, string color, string brand, short topSpeed) : base(registrationNumber, registrationDate, color, brand)
        {
            this.TopSpeed = topSpeed;
        }

        internal override void VehiclePerformance()
        {
            if (this.TopSpeed > 150)
            {
                Console.WriteLine("Performance: Fast car");
            }
            else if (this.TopSpeed > 80 && this.TopSpeed < 150)
            {
                Console.WriteLine("Performance: Normal car");
            }
            else if(this.TopSpeed <80)
            {
                Console.WriteLine("Performance: Slow car");
            }
        }

        internal override void PrintInfo()
        {
            base.PrintInfo();
            Console.WriteLine($"Top Speed: {this.TopSpeed}");
            //this.VehiclePerformance();
            VehiclePerformance();
        }

    }
}
