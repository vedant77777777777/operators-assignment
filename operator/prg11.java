 class prg11 {
    public static void main(String[] args) {
        int a = 10; // Binary: 0000 1010
       int b = 2; // Binary:0000 0010
        int c = a >> b;
        int  d = a << b;
	 System.out.println(">> (right shift): " + c);
        System.out.println(" << (left shift): " + d);
    }
}

