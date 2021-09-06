import java.util.Scanner;
class BankingSoftware {
	
	String [] ClientName = new String [5];
	String [] AccountName = new String [5];
	String [] AccountName1 = new String [5];
	String [] AccountName2 = new String [5];
	String [] AccountName3 = new String [5];
	String [] AccountName4 = new String [5];
	int [] AccountNumber = {1,2,3,4,5,6,7,8,9,10};
	int [] AccountBalance = {1,2,3,4,5,6,7,8,9,10};
	int [] AccountBalance1 = {1,2,3,4,5,6,7,8,9,10};
	int [] AccountNumber1 = {1,2,3,4,5,6,7,8,9,10};
	int [] AccountBalance2 = {1,2,3,4,5,6,7,8,9,10};
	int [] AccountNumber2 = {1,2,3,4,5,6,7,8,9,10};
	int [] AccountNumber3 = {1,2,3,4,5,6,7,8,9,10};
	int [] AccountBalance3 = {1,2,3,4,5,6,7,8,9,10};
	int [] AccountBalance4 = {1,2,3,4,5,6,7,8,9,10};
	int [] AccountNumber4 = {1,2,3,4,5,6,7,8,9,10};
	int NumAccounts = 0;
	int DisplayNumAccounts =0;
	int counter = -1;
	
	void BankOperation(){
		Scanner input = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
		boolean run = true;
		while(run){
			
			System.out.println("Create new Client: Choose 1");
			System.out.println("Display Client Information: Choose 2");
			System.out.println("Deposit Cash: Choose 3");
			System.out.println("Withdraw Cash: Choose 4");
			System.out.println("Quit The Program: Choose 5");
			System.out.println("Please Enter Your Choice:");
			int operation = input.nextInt();
			
			switch(operation){
				
				case 1:
					
					counter ++;
					if (counter==0){
						System.out.println("Enter the name of the new client");
						ClientName[0] = inp.nextLine();
						System.out.println("How many accounts do you want to create for the client?");
						NumAccounts = input.nextInt();
						DisplayNumAccounts = NumAccounts;
					}
					else if(counter==1){
						System.out.println("Enter the name of the new client");
						ClientName[1] = inp.nextLine();
						System.out.println("How many accounts do you want to create for the client?");
						NumAccounts = input.nextInt();
						DisplayNumAccounts = NumAccounts;
					}
					else if(counter==2){
						System.out.println("Enter the name of the new client");
						ClientName[2] = inp.nextLine();
						System.out.println("How many accounts do you want to create for the client?");
						NumAccounts = input.nextInt();
						DisplayNumAccounts = NumAccounts;
					}
					else if(counter==3){
						System.out.println("Enter the name of the new client");
						ClientName[3] = inp.nextLine();
						System.out.println("How many accounts do you want to create for the client?");
						NumAccounts = input.nextInt();
						DisplayNumAccounts = NumAccounts;
					}
					else{
						System.out.println("Enter the name of the new client");
						ClientName[4] = inp.nextLine();
						System.out.println("How many accounts do you want to create for the client?");
						NumAccounts = input.nextInt();
						DisplayNumAccounts = NumAccounts;
					}
					
					while(NumAccounts>0){
						//int [] Numbers = {NumAccounts};
						if (counter==1){
							if (NumAccounts==1){
								System.out.println("Enter the 5 digit number for the new account 1:");
								AccountNumber1[0] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance1[0] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName1[0] = inp.nextLine();
								break;
							}
							if (NumAccounts==2){
								System.out.println("Enter the 5 digit number for the new account 1:");
								AccountNumber1[0] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance1[0] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName1[0] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 2:");
								AccountNumber1[1] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance1[1] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName1[1] = inp.nextLine();
								break;
							}
							if (NumAccounts==3){
								System.out.println("Enter the 5 digit number for the new account 1:");
								AccountNumber1[0] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance1[0] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName1[0] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 2:");
								AccountNumber1[1] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance1[1] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName1[1] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 3:");
								AccountNumber1[2] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance1[2] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName1[2] = inp.nextLine();
								break;
							}
							if (NumAccounts==4){
								System.out.println("Enter the 5 digit number for the new account 1:");
								AccountNumber1[0] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance1[0] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName1[0] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 2:");
								AccountNumber1[1] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance1[1] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName1[1] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 3:");
								AccountNumber1[2] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance1[2] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName1[2] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 4:");
								AccountNumber1[3] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance1[3] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName1[3] = inp.nextLine();
								break;
							}
						}
						if (counter==2){
							if (NumAccounts==1){
								System.out.println("Enter the 5 digit number for the new account 1:");
								AccountNumber2[0] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance2[0] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName2[0] = inp.nextLine();
								break;
							}
							if (NumAccounts==2){
								System.out.println("Enter the 5 digit number for the new account 1:");
								AccountNumber2[0] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance2[0] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName2[0] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 2:");
								AccountNumber2[1] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance2[1] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName2[1] = inp.nextLine();
								break;
							}
							if (NumAccounts==3){
								System.out.println("Enter the 5 digit number for the new account 1:");
								AccountNumber2[0] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance2[0] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName2[0] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 2:");
								AccountNumber2[1] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance2[1] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName2[1] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 3:");
								AccountNumber2[2] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance2[2] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName2[2] = inp.nextLine();
								break;
							}
							if (NumAccounts==4){
								System.out.println("Enter the 5 digit number for the new account 1:");
								AccountNumber2[0] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance2[0] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName2[0] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 2:");
								AccountNumber2[1] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance2[1] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName2[1] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 3:");
								AccountNumber2[2] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance2[2] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName2[2] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 4:");
								AccountNumber2[3] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance2[3] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName2[3] = inp.nextLine();
								break;
							}
						}
						if (counter==3){
							if (NumAccounts==1){
								System.out.println("Enter the 5 digit number for the new account 1:");
								AccountNumber3[0] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance3[0] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName3[0] = inp.nextLine();
								break;
							}
							if (NumAccounts==2){
								System.out.println("Enter the 5 digit number for the new account 1:");
								AccountNumber3[0] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance3[0] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName3[0] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 2:");
								AccountNumber3[1] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance3[1] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName3[1] = inp.nextLine();
								break;
							}
							if (NumAccounts==3){
								System.out.println("Enter the 5 digit number for the new account 1:");
								AccountNumber3[0] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance3[0] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName3[0] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 2:");
								AccountNumber3[1] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance3[1] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName3[1] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 3:");
								AccountNumber3[2] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance3[2] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName3[2] = inp.nextLine();
								break;
							}
							if (NumAccounts==4){
								System.out.println("Enter the 5 digit number for the new account 1:");
								AccountNumber3[0] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance3[0] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName3[0] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 2:");
								AccountNumber3[1] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance3[1] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName3[1] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 3:");
								AccountNumber3[2] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance3[2] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName3[2] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 4:");
								AccountNumber3[3] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance3[3] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName3[3] = inp.nextLine();
								break;
							}
						}
						if (counter==4){
							if (NumAccounts==1){
								System.out.println("Enter the 5 digit number for the new account 1:");
								AccountNumber4[0] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance4[0] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName4[0] = inp.nextLine();
								break;
							}
							if (NumAccounts==2){
								System.out.println("Enter the 5 digit number for the new account 1:");
								AccountNumber4[0] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance4[0] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName4[0] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 2:");
								AccountNumber4[1] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance4[1] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName4[1] = inp.nextLine();
								break;
							}
							if (NumAccounts==3){
								System.out.println("Enter the 5 digit number for the new account 1:");
								AccountNumber4[0] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance4[0] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName4[0] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 2:");
								AccountNumber4[1] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance4[1] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName4[1] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 3:");
								AccountNumber4[2] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance4[2] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName4[2] = inp.nextLine();
								break;
							}
							if (NumAccounts==4){
								System.out.println("Enter the 5 digit number for the new account 1:");
								AccountNumber4[0] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance4[0] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName4[0] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 2:");
								AccountNumber4[1] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance4[1] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName4[1] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 3:");
								AccountNumber4[2] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance4[2] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName4[2] = inp.nextLine();
								System.out.println("Enter the 5 digit number for the new account 4:");
								AccountNumber4[3] = input.nextInt();
								System.out.println("Enter the opening balance for the new account");
								AccountBalance4[3] = input.nextInt();
								System.out.println("Enter the type of new account");
								AccountName4[3] = inp.nextLine();
								break;
							}
						}
						
						if (NumAccounts==1){
							System.out.println("Enter the 5 digit number for the new account 1:");
							AccountNumber[0] = input.nextInt();
							System.out.println("Enter the opening balance for the new account");
							AccountBalance[0] = input.nextInt();
							System.out.println("Enter the type of new account");
							AccountName[0] = inp.nextLine();
							break;
						}
						
						if (NumAccounts==2){
							System.out.println("Enter the 5 digit number for the new account 1:");
							AccountNumber[0] = input.nextInt();
							System.out.println("Enter the opening balance for the new account");
							AccountBalance[0] = input.nextInt();
							System.out.println("Enter the type of new account");
							AccountName[0] = inp.nextLine();
							System.out.println("Enter the 5 digit number for the new account 2:");
							AccountNumber[1] = input.nextInt();
							System.out.println("Enter the opening balance for the new account");
							AccountBalance[1] = input.nextInt();
							System.out.println("Enter the type of new account");
							AccountName[1] = inp.nextLine();
							
							break;
						}
						
						if (NumAccounts==3){
							System.out.println("Enter the 5 digit number for the new account 1:");
							AccountNumber[0] = input.nextInt();
							System.out.println("Enter the opening balance for the new account");
							AccountBalance[0] = input.nextInt();
							System.out.println("Enter the type of new account");
							AccountName[0] = inp.nextLine();
							System.out.println("Enter the 5 digit number for the new account 2:");
							AccountNumber[1] = input.nextInt();
							System.out.println("Enter the opening balance for the new account");
							AccountBalance[1] = input.nextInt();
							System.out.println("Enter the type of new account");
							AccountName[1] = inp.nextLine();
							System.out.println("Enter the 5 digit number for the new account 3:");
							AccountNumber[2] = input.nextInt();
							System.out.println("Enter the opening balance for the new account");
							AccountBalance[2] = input.nextInt();
							System.out.println("Enter the type of new account");
							AccountName[2] = inp.nextLine();
							break;
						}
						
						if (NumAccounts==4){
							System.out.println("Enter the 5 digit number for the new account 1:");
							AccountNumber[0] = input.nextInt();
							System.out.println("Enter the opening balance for the new account");
							AccountBalance[0] = input.nextInt();
							System.out.println("Enter the type of new account");
							AccountName[0] = inp.nextLine();
							System.out.println("Enter the 5 digit number for the new account 2:");
							AccountNumber[1] = input.nextInt();
							System.out.println("Enter the opening balance for the new account");
							AccountBalance[1] = input.nextInt();
							System.out.println("Enter the type of new account");
							AccountName[1] = inp.nextLine();
							System.out.println("Enter the 5 digit number for the new account 3:");
							AccountNumber[2] = input.nextInt();
							System.out.println("Enter the opening balance for the new account");
							AccountBalance[2] = input.nextInt();
							System.out.println("Enter the type of new account");
							AccountName[2] = inp.nextLine();
							System.out.println("Enter the 5 digit number for the new account 4:");
							AccountNumber[3] = input.nextInt();
							System.out.println("Enter the opening balance for the new account");
							AccountBalance[3] = input.nextInt();
							System.out.println("Enter the type of new account");
							AccountName[3] = inp.nextLine();
							break;
						}
						
						
						
						
					}
					
					break;
				
				case 2:
					System.out.println("Which client? 1-5");
					int selection = input.nextInt();
					if (selection ==1){
						System.out.println("Client Name: "+ClientName[0]);
						if (DisplayNumAccounts==1){
							System.out.println("Account 1 "+AccountName[0]+" Account number: "+AccountNumber[0]+" has balance $"+AccountBalance[0]);
							int Total = AccountBalance[0];
							System.out.println("Total: $"+Total);
						}
						if (DisplayNumAccounts==2){
							System.out.println("Account 1 "+AccountName[0]+" Account number: "+AccountNumber[0]+" has balance $"+AccountBalance[0]);
							System.out.println("Account 2 "+AccountName[1]+" Account number: "+AccountNumber[1]+" has balance $"+AccountBalance[1]);
							int Total = AccountBalance[0]+AccountBalance[1];
							System.out.println("Total: $"+Total);
						}
						if (DisplayNumAccounts==3){
							System.out.println("Account 1 "+AccountName[0]+" Account number: "+AccountNumber[0]+" has balance $"+AccountBalance[0]);
							System.out.println("Account 2 "+AccountName[1]+" Account number: "+AccountNumber[1]+" has balance $"+AccountBalance[1]);
							System.out.println("Account 3 "+AccountName[2]+" Account number: "+AccountNumber[2]+" has balance $"+AccountBalance[2]);
							int Total = AccountBalance[0]+AccountBalance[1]+AccountBalance[2];
							System.out.println("Total: $"+Total);
						}
					}
					if (selection ==2){
						System.out.println("Client Name: "+ClientName[1]);
						if (DisplayNumAccounts==1){
							System.out.println("Account 1 "+AccountName1[0]+" Account number: "+AccountNumber1[0]+" has balance $"+AccountBalance1[0]);
							int Total = AccountBalance1[0];
							System.out.println("Total: $"+Total);
						}
						if (DisplayNumAccounts>=2){
							System.out.println("Account 1 "+AccountName1[0]+" Account number: "+AccountNumber1[0]+" has balance $"+AccountBalance1[0]);
							System.out.println("Account 2 "+AccountName1[1]+" Account number: "+AccountNumber1[1]+" has balance $"+AccountBalance1[1]);
							int Total = AccountBalance1[0]+AccountBalance1[1];
							System.out.println("Total: $"+Total);
						}
						if (DisplayNumAccounts==3){
							System.out.println("Account 1 "+AccountName1[0]+" Account number: "+AccountNumber1[0]+" has balance $"+AccountBalance1[0]);
							System.out.println("Account 2 "+AccountName1[1]+" Account number: "+AccountNumber1[1]+" has balance $"+AccountBalance1[1]);
							System.out.println("Account 3 "+AccountName1[2]+" Account number: "+AccountNumber1[2]+" has balance $"+AccountBalance1[2]);
							int Total = AccountBalance1[0]+AccountBalance1[1]+AccountBalance1[2];
							System.out.println("Total: $"+Total);
						}
					}
					if (selection ==3){
						System.out.println("Client Name: "+ClientName[2]);
						if (DisplayNumAccounts==1){
							System.out.println("Account 1 "+AccountName2[0]+" Account number: "+AccountNumber2[0]+" has balance $"+AccountBalance2[0]);
							int Total = AccountBalance2[0];
							System.out.println("Total: $"+Total);
						}
						if (DisplayNumAccounts>=2){
							System.out.println("Account 1 "+AccountName2[0]+" Account number: "+AccountNumber2[0]+" has balance $"+AccountBalance2[0]);
							System.out.println("Account 2 "+AccountName2[1]+" Account number: "+AccountNumber2[1]+" has balance $"+AccountBalance2[1]);
							int Total = AccountBalance2[0]+AccountBalance2[1];
							System.out.println("Total: $"+Total);
						}
						if (DisplayNumAccounts==3){
							System.out.println("Account 1 "+AccountName2[0]+" Account number: "+AccountNumber2[0]+" has balance $"+AccountBalance2[0]);
							System.out.println("Account 2 "+AccountName2[1]+" Account number: "+AccountNumber2[1]+" has balance $"+AccountBalance2[1]);
							System.out.println("Account 3 "+AccountName2[2]+" Account number: "+AccountNumber2[2]+" has balance $"+AccountBalance2[2]);
							int Total = AccountBalance2[0]+AccountBalance2[1]+AccountBalance2[2];
							System.out.println("Total: $"+Total);
						}
					}
					if (selection ==4){
						System.out.println("Client Name: "+ClientName[3]);
						if (DisplayNumAccounts==1){
							System.out.println("Account 1 "+AccountName3[0]+" Account number: "+AccountNumber3[0]+" has balance $"+AccountBalance3[0]);
							int Total = AccountBalance3[0];
							System.out.println("Total: $"+Total);
						}
						if (DisplayNumAccounts>=2){
							System.out.println("Account 1 "+AccountName3[0]+" Account number: "+AccountNumber3[0]+" has balance $"+AccountBalance3[0]);
							System.out.println("Account 2 "+AccountName3[1]+" Account number: "+AccountNumber3[1]+" has balance $"+AccountBalance3[1]);
							int Total = AccountBalance3[0]+AccountBalance3[1];
							System.out.println("Total: $"+Total);
						}
						if (DisplayNumAccounts==3){
							System.out.println("Account 1 "+AccountName3[0]+" Account number: "+AccountNumber3[0]+" has balance $"+AccountBalance3[0]);
							System.out.println("Account 2 "+AccountName3[1]+" Account number: "+AccountNumber3[1]+" has balance $"+AccountBalance3[1]);
							System.out.println("Account 3 "+AccountName3[2]+" Account number: "+AccountNumber3[2]+" has balance $"+AccountBalance3[2]);
							int Total = AccountBalance3[0]+AccountBalance3[1]+AccountBalance3[2];
							System.out.println("Total: $"+Total);
						}
					}
					if (selection ==5){
						System.out.println("Client Name: "+ClientName[4]);
						if (DisplayNumAccounts==1){
							System.out.println("Account 1 "+AccountName4[0]+" Account number: "+AccountNumber4[0]+" has balance $"+AccountBalance4[0]);
							int Total = AccountBalance4[0];
							System.out.println("Total: $"+Total);
						}
						if (DisplayNumAccounts>=2){
							System.out.println("Account 1 "+AccountName4[0]+" Account number: "+AccountNumber4[0]+" has balance $"+AccountBalance4[0]);
							System.out.println("Account 2 "+AccountName4[1]+" Account number: "+AccountNumber4[1]+" has balance $"+AccountBalance4[1]);
							int Total = AccountBalance4[0]+AccountBalance4[1];
							System.out.println("Total: $"+Total);
						}
						if (DisplayNumAccounts==3){
							System.out.println("Account 1 "+AccountName4[0]+" Account number: "+AccountNumber4[0]+" has balance $"+AccountBalance4[0]);
							System.out.println("Account 2 "+AccountName4[1]+" Account number: "+AccountNumber4[1]+" has balance $"+AccountBalance4[1]);
							System.out.println("Account 3 "+AccountName4[2]+" Account number: "+AccountNumber4[2]+" has balance $"+AccountBalance4[2]);
							int Total = AccountBalance4[0]+AccountBalance4[1]+AccountBalance4[2];
							System.out.println("Total: $"+Total);
						}
					}
					break;
					
				case 3:
					System.out.println("Which client? 1-5");
					selection = input.nextInt();
					if (selection==1){
						System.out.println("Client Name: "+ClientName[0]);
						System.out.println("Which Account? 1-2");
						int selection2 = input.nextInt();
						if (selection2==1){
							System.out.println("Enter the amount to deposit");
							int NewAmount = input.nextInt();
							AccountBalance[0] = NewAmount+AccountBalance[0];
						}
						else{
							System.out.println("Enter the amount to deposit");
							int NewAmount = input.nextInt();
							AccountBalance[1] = NewAmount+AccountBalance[1];
						}
					}
					if (selection==2){
						System.out.println("Client Name: "+ClientName[1]);
						System.out.println("Which Account? 1-2");
						int selection2 = input.nextInt();
						if (selection2==1){
							System.out.println("Enter the amount to deposit");
							int NewAmount = input.nextInt();
							AccountBalance1[0] = NewAmount+AccountBalance1[0];
						}
						else{
							System.out.println("Enter the amount to deposit");
							int NewAmount = input.nextInt();
							AccountBalance1[1] = NewAmount+AccountBalance1[1];
						}
					}
					if (selection==3){
						System.out.println("Client Name: "+ClientName[2]);
						System.out.println("Which Account? 1-2");
						int selection2 = input.nextInt();
						if (selection2==1){
							System.out.println("Enter the amount to deposit");
							int NewAmount = input.nextInt();
							AccountBalance2[0] = NewAmount+AccountBalance2[0];
						}
						else{
							System.out.println("Enter the amount to deposit");
							int NewAmount = input.nextInt();
							AccountBalance2[1] = NewAmount+AccountBalance2[1];
						}
					}
					if (selection==4){
						System.out.println("Client Name: "+ClientName[3]);
						System.out.println("Which Account? 1-2");
						int selection2 = input.nextInt();
						if (selection2==1){
							System.out.println("Enter the amount to deposit");
							int NewAmount = input.nextInt();
							AccountBalance3[0] = NewAmount+AccountBalance3[0];
						}
						else{
							System.out.println("Enter the amount to deposit");
							int NewAmount = input.nextInt();
							AccountBalance3[1] = NewAmount+AccountBalance3[1];
						}
					}
					if (selection==5){
						System.out.println("Client Name: "+ClientName[4]);
						System.out.println("Which Account? 1-2");
						int selection2 = input.nextInt();
						if (selection2==1){
							System.out.println("Enter the amount to deposit");
							int NewAmount = input.nextInt();
							AccountBalance4[0] = NewAmount+AccountBalance4[0];
						}
						else{
							System.out.println("Enter the amount to deposit");
							int NewAmount = input.nextInt();
							AccountBalance4[1] = NewAmount+AccountBalance4[1];
						}
					}
					break;
					
				case 4:
					System.out.println("Which client? 1-5");
					selection = input.nextInt();
					if (selection==1){
						System.out.println("Client Name: "+ClientName[0]);
						System.out.println("Which Account? 1-2");
						int selection2 = input.nextInt();
						if (selection2==1){
							System.out.println("Enter the amount to withdraw");
							int NewAmount = input.nextInt();
							AccountBalance[0] = AccountBalance[0] - NewAmount;
						}
						else{
							System.out.println("Enter the amount to withdraw");
							int NewAmount = input.nextInt();
							AccountBalance[1] = AccountBalance[1] - NewAmount;
						}
					}
					if (selection==2){
						System.out.println("Client Name: "+ClientName[1]);
						System.out.println("Which Account? 1-2");
						int selection2 = input.nextInt();
						if (selection2==1){
							System.out.println("Enter the amount to withdraw");
							int NewAmount = input.nextInt();
							AccountBalance1[0] = AccountBalance1[0] - NewAmount;
						}
						else{
							System.out.println("Enter the amount to withdraw");
							int NewAmount = input.nextInt();
							AccountBalance1[1] = AccountBalance1[1] - NewAmount;
						}
					}
					if (selection==3){
						System.out.println("Client Name: "+ClientName[2]);
						System.out.println("Which Account? 1-2");
						int selection2 = input.nextInt();
						if (selection2==1){
							System.out.println("Enter the amount to withdraw");
							int NewAmount = input.nextInt();
							AccountBalance2[0] = AccountBalance2[0] - NewAmount;
						}
						else{
							System.out.println("Enter the amount to withdraw");
							int NewAmount = input.nextInt();
							AccountBalance2[1] = AccountBalance2[1] - NewAmount;
						}
					}
					if (selection==4){
						System.out.println("Client Name: "+ClientName[3]);
						System.out.println("Which Account? 1-2");
						int selection2 = input.nextInt();
						if (selection2==1){
							System.out.println("Enter the amount to withdraw");
							int NewAmount = input.nextInt();
							AccountBalance3[0] = AccountBalance3[0] - NewAmount;
						}
						else{
							System.out.println("Enter the amount to withdraw");
							int NewAmount = input.nextInt();
							AccountBalance3[1] = AccountBalance3[1] - NewAmount;
						}
					}
					if (selection==5){
						System.out.println("Client Name: "+ClientName[4]);
						System.out.println("Which Account? 1-2");
						int selection2 = input.nextInt();
						if (selection2==1){
							System.out.println("Enter the amount to withdraw");
							int NewAmount = input.nextInt();
							AccountBalance4[0] = AccountBalance4[0] - NewAmount;
						}
						else{
							System.out.println("Enter the amount to withdraw");
							int NewAmount = input.nextInt();
							AccountBalance4[1] = AccountBalance4[1] - NewAmount;
						}
					}
					break;
				
				case 5:
					System.out.println("Goodbye.");
					input.close();
					inp.close();
					run = false;
					break;
			}		
		}
	}
}
public class FinalProject{
	public static void main (String args[]) {
		BankingSoftware Vince = new BankingSoftware();
		Vince.BankOperation();
	}
}
	