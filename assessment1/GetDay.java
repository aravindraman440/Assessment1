package assessment1;

public class GetDay {
	public String getDayName() {
		String str="Thursday";
		//System.out.println(str);
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GetDay obj =new GetDay();
//obj.getDayName();
String string = obj.getDayName();
System.out.println(string);
	}

}
