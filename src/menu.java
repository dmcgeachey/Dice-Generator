import java.io.*;
public class menu {

    public static void main(String[] args)
        	throws IOException
		{
                    dice dice = new dice();
			int option;
			BufferedReader input=new BufferedReader
	              (new InputStreamReader(System.in));
			do
			{
				System.out.println("");
				System.out.println("Select Dice Type");
				System.out.println("1:D20, 2:D100, 3:D12, 4:D10, 5:D8, 6:D6, 7:D4, 8:D3, 9:Quit");
				
				option=Integer.parseInt(input.readLine());;
				switch (option)
				{
					case 1: dice.D20();
                                            break;
					case 2: dice.D100();
                                            break;
					case 3: dice.D12();
                                            break;
                                        case 4: dice.D10();
                                            break;
                                        case 5: dice.D8();
                                            break;
                                        case 6: dice.D6();
                                            break;
                                        case 7: dice.D4();
                                            break;
                                        case 8: dice.D3();
                                            break;
					case 9:System.exit(0);
                                            break;
				}
			}while(option!=0);
    }
    }

