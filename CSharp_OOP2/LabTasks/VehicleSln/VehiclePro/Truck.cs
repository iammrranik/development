using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http.Headers;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;
//using static VehiclePro.Vehicle;

namespace VehiclePro
{
    internal class Truck:Vehicle
    {
        private short capacity;
        private byte numberOfWheel;

        internal short Capacity
        {
            get { return this.capacity; }
            set { this.capacity = value; }
        }

        internal byte NumberOfWheels
        {
            get { return this.numberOfWheel; }
            set { this.numberOfWheel = value; }
        }

        internal Truck(string registrationNumber, RegistrationDate registrationDate, string color, string brand, short capacity, byte numberOfWheel) : base(registrationNumber, registrationDate, color, brand)
        {
            this.Capacity = capacity;
            this.numberOfWheel = numberOfWheel;
        }

        internal override void VehiclePerformance()
        {
            if (this.Capacity > 2)
            {
                Console.WriteLine("Performance: Heavy duty truck");
            }
            else if (this.Capacity > 1 && this.Capacity < 2)
            {
                Console.WriteLine("Performance: Medium size truck");
            }
            else
            {
                Console.WriteLine("Performance: Small size truck");
            }
        }

        internal override void PrintInfo()
        {
            base.PrintInfo();
            Console.WriteLine($"Capacity: {this.Capacity}");
            Console.WriteLine($"Number of wheels: {this.NumberOfWheels}");
            //this.VehiclePerformance();
            VehiclePerformance();
        }

    }
}
