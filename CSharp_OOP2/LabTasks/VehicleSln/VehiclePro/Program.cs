using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
//using static VehiclePro.Vehicle;

namespace VehiclePro
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Vehicle[] car = new Car[5];
            car[0] = new Car("1", new RegistrationDate(10, 1, 2024), "Green", "A", 120);
            car[1] = new Car("2", new RegistrationDate(11, 4, 2025), "Blue", "B", 190);
            car[0].PrintInfo();

            int i = 0;
            while (i < 2)
            {
                car[i].PrintInfo();
                Console.WriteLine();
                i++;
            }

            Console.WriteLine();

            Vehicle[] truck = new Truck[5];
            truck[0] = new Truck("1", new RegistrationDate(2, 1, 2021), "Red", "A", 1, 4);
            truck[0].PrintInfo();

        }
    }
}
