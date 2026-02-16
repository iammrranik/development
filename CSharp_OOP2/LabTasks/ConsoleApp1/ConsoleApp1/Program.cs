using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Console.WriteLine("Hello");
            int[] ax = new int[5] { 1, 2, 3, 4, 5 };
            for (int i = 0; i < 5; i++)
            {
                Console.Write($"{ax[i]} ");
            }
            Console.WriteLine();
            int i1 = 0;
            while (i1 < 5)
            {
                Console.Write($"{ax[i1]} ");
                i1++;
            }
            Console.WriteLine();
            int i2 = 0;
            do
            {
                Console.Write($"{ax[i2]} ");
                i2++;
            }while(i2 < 5);
            Console.WriteLine();
            foreach (int i in ax)
            {
                Console.Write($"{i} ");
            }
            Console.WriteLine();

            int[,] bx = new int[4, 3] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

            //for(int i = 0;i < 4; i++)
            //{
            //    for(int j = 0; j<3; j++)
            //    {
            //        Console.Write($"{bx[i,j]} ");
            //    }
            //    Console.WriteLine();
            //}
            int r = 0, c = 0;
            //while (r < 4)
            //{
            //    c = 0;
            //    while(c < 3)
            //    {
            //        Console.Write($"{bx[r, c]} ");
            //        c++;
            //    }
            //    Console.WriteLine();
            //    r++;
            //}

            int[][] arr = new int[4][];
            arr[0] = new int[2] { 1, 2 };
            arr[1] = new int[3] { 4, 11, 1 };
            arr[2] = new int[4] { 5, 1, 2, 3 };
            arr[3] = new int[1] { 8 };

            r = 0;
            while (r < arr.Length)
            {
                c = 0;
                while (c < arr[r].Length)
                {
                    Console.Write($"{arr[r][c]} ");
                    c++;
                }
                Console.WriteLine();
                r++;
            }

        }
    }
}
