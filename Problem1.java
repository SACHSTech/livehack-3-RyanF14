class Problem1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    System.out.println("**** Student Account Registration *****");
    String fnameIN = readLine("Enter your first name: ");
    String lnameIN = readLine("Enter your last name: ");
    String studentnumIN =  readLine("Enter your student number: ");
    String passwordInput = readLine("Enter your new password");
    //int uppercasepresent= 0;

    
    createUserName(fnameIN, lnameIN, studentnumIN);
    validatePassword(passwordInput);
  }



/** 
 * @param FNAME
 * @param LNAME
 * @param STUDENTNUMBER
 */
public void createUserName(String FNAME, String LNAME, String STUDENTNUMBER ){
  if( FNAME.length() == 0 ||LNAME.length() == 0  || (int) STUDENTNUMBER.length() <= 8){
    throw new IllegalArgumentException("First/Last name cannot be blank, or student number cannot be less than 9 digits");
  }
  else{
  String CompleteUsername = FNAME.substring(0,1).toUpperCase() + "" + LNAME.substring(0,4) + "" + STUDENTNUMBER.substring(6, 9);
  System.out.print("Your newly created username is: ");
  System.out.println(CompleteUsername);
  }
}

public void validatePassword(String password){
  
  for(int i = 0; i <=7; i++ ){
    int uppercasepresent;
    //if(Character.isUpperCase(password.charAt(1))){
      //uppercasepresent = 1;
    
      if(password.length()>= 7 && Character.isLetterOrDigit(password.charAt(i))
      )  {

     System.out.println("validation success");;
    
      
    }
    else{
      throw new IllegalArgumentException("incorrect parameter(s)");
  
}

}
  }
}
