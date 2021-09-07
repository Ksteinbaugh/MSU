using System;
using System.IO;

namespace FileOperation
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                //Pass the file path and file name to the StreamReader constructor
                StreamReader sr = new StreamReader("Sample.txt");
                
                String line = sr.ReadLine();

                if(line.Contains("bear")){
                    
                    Console.WriteLine("File contains bear.");
                }
                else
                {
                    Console.WriteLine("File does not contain bear.");
                }
            }
            catch (System.Exception)
            {
                
                throw;
            }
        }
    }
}
