package com.hamitmizrak;

public class _23_TryCatch {
	
	public static void fakeMailSend(String data) {
		System.out.println("admine mail gönderildi" + data);
	}
	
	public static void main(String[] args) {
		// syntax error
		// intx number = 4 / 1;
		// System.out.println(number);
		
		// logic error: tanımsız,
		try {
			int number = 4 / 0;
			System.out.println(number);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			fakeMailSend(ae.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			fakeMailSend(e.getMessage());
		} finally {
			System.out.println("mutlaka çalışacak yerdir. db.close() port.close()");
		}
		
		System.out.println("son satır");
		
	}
}
