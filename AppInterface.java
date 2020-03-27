import java.util.*;
import Electricity.*;
import Length.*;
import Mass.*;

/**
 * This is a personal project that I have been working on for a while. It is
 * programmed using Java. It has several packages that contain the category of
 * the unit to be converted. The app interface is also provided but the classes
 * are used to be individually used. The app itself has options for categories
 * and then to converted to the selected unit to the other units.
 * 
 * @author Jay Darshan Vakil
 * @version 03/27/2020
 */
public class AppInterface {
    public static void main(String[] args) throws ElectricityException, LengthException, MassException {
        Scanner s = new Scanner(System.in);
        String menu, mainMenu;

        System.out.println(
                "Hello! How are you doing? Welcome to my program. Here are some options displayed and the instructions. Enjoy!\n");
        do {
            System.out.println(
                    "This program converts the given units in each measurement to the possible units and also the SI unit");
            System.out.println("\tfor the selected measurement.");
            System.out.println(
                    "Please enter the option number or enter \"exit\"(case insensitive) to exit the program.\n");
            System.out.println("1. Length (Km, M, Cm, Mm, Um, Nm, Mi, In, Yd, NauM)");
            System.out.println("2. Mass (Mt, Kg, g, mg, Mg, It, Ut, St, p, o)");
            System.out.println("3. Electricity (V, I, R)");
            System.out.println("\"exit\". Exit the program.");
            final String main = s.next();// This allows the user to enter an option.
            mainMenu = main.toLowerCase();// This takes the entered option and turns it into all lower case.
            switch (mainMenu) {
                case "1":
                    do {
                        double kme, me, cme, mme, Mme, nme, inc, mie, naum, yds;
                        System.out.println("Please select a following option: ");
                        System.out.println("1. Kilometers");
                        System.out.println("2. Meters");
                        System.out.println("3. Centimeters");
                        System.out.println("4. Millimeters");
                        System.out.println("5. Micrometers");
                        System.out.println("6. Nanometers");
                        System.out.println("7. Miles");
                        System.out.println("8. Inches");
                        System.out.println("9. Yards");
                        System.out.println("10. Nautical Miles");
                        System.out.println("0. Exit");
                        menu = s.next();
                        switch (menu) {
                            case "1":
                                System.out.print("Enter Kilometers here: ");
                                kme = s.nextDouble();
                                final Kilometers km = new Kilometers(kme);
                                System.out.println(km);
                                break;
                            case "2":
                                System.out.print("Enter Meters here: ");
                                me = s.nextDouble();
                                final Meters m = new Meters(me);
                                System.out.println(m);
                                break;

                            case "3":
                                System.out.print("Enter Centimeters here: ");
                                cme = s.nextDouble();
                                final Centimeters cm = new Centimeters(cme);
                                System.out.println(cm);
                                break;

                            case "4":
                                System.out.print("Enter Millimeters here: ");
                                mme = s.nextDouble();
                                final Millimeters mm = new Millimeters(mme);
                                System.out.println(mm);
                                break;

                            case "5":
                                System.out.print("Enter Micrometers here: ");
                                Mme = s.nextDouble();
                                final Micrometers Mm = new Micrometers(Mme);
                                System.out.println(Mm);
                                break;

                            case "6":
                                System.out.print("Enter Nanometers here: ");
                                nme = s.nextDouble();
                                final Nanometers nm = new Nanometers(nme);
                                System.out.println(nm);
                                break;

                            case "7":
                                System.out.print("Enter Miles here: ");
                                mie = s.nextDouble();
                                final Miles mi = new Miles(mie);
                                System.out.println(mi);
                                break;

                            case "8":
                                System.out.print("Enter Inches here: ");
                                inc = s.nextDouble();
                                final Inches in = new Inches(inc);
                                System.out.println(in);
                                break;

                            case "9":
                                System.out.print("Enter Yards here: ");
                                yds = s.nextDouble();
                                final Yards yrd = new Yards(yds);
                                System.out.println(yrd);
                                break;

                            case "10":
                                System.out.print("Enter Nautical Miles here: ");
                                naum = s.nextDouble();
                                final NauticalMiles NauM = new NauticalMiles(naum);
                                System.out.println(NauM);
                                break;

                            case "0":
                                System.out.println("Going back to the main menu");
                                break;

                            default:
                                System.out.println("You entered: " + menu
                                        + ", this option is invalid, please enter an option above.");
                        }
                    } while (!menu.equals("0"));
                    break;

                // bigger menu case
                case "2":
                    do {
                        double mtons, kgs, gs, mgs, Mgs, its, usts, sts;
                        final double ps, os;// pounds and ounces
                        System.out.println("Please select a following option: ");
                        System.out.println("1. Metric Tons");
                        System.out.println("2. Kilograms");
                        System.out.println("3. Grams");
                        System.out.println("4. Milligrams");
                        System.out.println("5. Micrograms");
                        System.out.println("6. Imperial Tons");
                        System.out.println("7. US Tons");
                        System.out.println("8. Stones");
                        System.out.println("9. Pounds");
                        System.out.println("10. Ounces");
                        System.out.println("0. Exit");
                        menu = s.next();
                        switch (menu) {
                            case "1":
                                System.out.print("Enter Metric tons here: ");
                                mtons = s.nextDouble();
                                final MetricTons mt = new MetricTons(mtons);
                                System.out.println(mt);
                                break;

                            case "2":
                                System.out.print("Enter Kilograms here: ");
                                kgs = s.nextDouble();
                                final Kilograms kg = new Kilograms(kgs);
                                System.out.println(kg);
                                break;

                            case "3":
                                System.out.print("Enter Grams here: ");
                                gs = s.nextDouble();
                                final Grams g = new Grams(gs);
                                System.out.println(g);
                                break;

                            case "4":
                                System.out.print("Enter Milligrams here: ");
                                mgs = s.nextDouble();
                                final Milligrams mg = new Milligrams(mgs);
                                System.out.println(mg);
                                break;

                            case "5":
                                System.out.print("Enter Micrograms here: ");
                                Mgs = s.nextDouble();
                                final Micrograms Mg = new Micrograms(Mgs);
                                System.out.println(Mg);
                                break;

                            case "6":
                                System.out.println("Enter Imperial tons here: ");
                                its = s.nextDouble();
                                final ImperialTons it = new ImperialTons(its);
                                System.out.println(it);
                                break;

                            case "7":
                                System.out.println("Enter US tons here: ");
                                usts = s.nextDouble();
                                final UsTons ust = new UsTons(usts);
                                System.out.println(ust);
                                break;

                            case "8":
                                System.out.print("Enter Stones here: ");
                                sts = s.nextDouble();
                                final Stones st = new Stones(sts);
                                System.out.println(st);
                                break;

                            case "9":
                                System.out.println("Enter Pounds here: ");
                                ps = s.nextDouble();
                                final Pounds p = new Pounds(ps);
                                System.out.println(p);
                                break;

                            case "10":
                                System.out.println("Enter Ounces here: ");
                                os = s.nextDouble();
                                final Ounces o = new Ounces(os);
                                System.out.println(o);
                                break;

                            case "0":
                                System.out.println("Going back to the main menu");
                                break;

                            default:
                                System.out.println("You entered: " + menu
                                        + ", this option is invalid, please enter an option above.");
                        }
                    } while (!menu.equals("0"));
                    break;

                case "3":
                    do {
                        double current, voltage, resistance;
                        System.out.println(
                                "This option allows you to apply Ohm's law to any value of Current, Voltage, or Resistance.");
                        System.out.println("The Ohm's law is Voltage = Current * Resistance");
                        System.out.println("Please select a following option: ");
                        System.out.println("1. Current");
                        System.out.println("2. Voltage");
                        System.out.println("3. Resistance");
                        System.out.println("0. exit");
                        menu = s.next();
                        switch (menu) {
                            case "1":
                                System.out.println("Please enter the voltage followed by the resistance: ");
                                voltage = s.nextDouble();
                                resistance = s.nextDouble();
                                Amps amp = new Amps(voltage, resistance);
                                System.out.println(amp);
                                break;

                            case "2":
                                System.out.println("Please enter the Current followed by the resistance: ");
                                current = s.nextDouble();
                                resistance = s.nextDouble();
                                Volts volt = new Volts(resistance, current);
                                System.out.println(volt);
                                break;

                            case "3":
                                System.out.println("Please enter the Voltage followed by the Current: ");
                                voltage = s.nextDouble();
                                current = s.nextDouble();
                                Ohms ohm = new Ohms(voltage, current);
                                System.out.println(ohm);
                                break;

                            default:
                                System.out.println("You entered: " + menu
                                        + ", this option is invalid, please enter an option above.");

                        }

                    } while (!menu.equals("0"));
                    break;

                case "exit":
                    System.out.println("Goodbye buddy, see you again!");
                    break;

                default:
                    System.out.println(
                            "You entered: " + mainMenu + ", this option is invalid, please enter an option above.\n");
                    break;
            }
        } while (!mainMenu.equals("exit"));
        s.close();
    }
}