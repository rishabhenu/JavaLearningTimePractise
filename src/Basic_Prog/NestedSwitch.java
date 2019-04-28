package Basic_Prog;

class NestedSwitch{
	
public static void main(String args[]) {
int year=2;
char stream='E';
	switch(year) {
	
	case 1:
		System.out.println("you are studying in 1st year");
		break;
	
	case 2:
		switch(stream) {
		case 'C':
			System.out.println("you are studying in 2nd year CSE");
			break;
		
		case 'E':
			System.out.println("you are studying in 2nd year ECE");
			break;
		}
	break;
	case 3:
		switch(stream) {
		case 'C':
			System.out.println("you are studying in 3rd year CSE");
			break;
			
		case 'E':
			System.out.println("you are studying in 3rd year ECE");
			break;
		}
	break;
	
	default:
		System.out.println("please enter a valid integer");
		
}}}
