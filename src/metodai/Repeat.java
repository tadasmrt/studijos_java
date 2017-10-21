package metodai;

public class Repeat {
	    public static void main(String[] args)  {
	        int n = Integer.parseInt(args[0]);
	        String s = args[1];
	        int l = s.length();
	        long start, end;

	        start = System.currentTimeMillis();
	        for (int i = 0; i < n; i++) {
	            if(repeatLog2(s,i).length()!=i*l) throw new RuntimeException();
	        }
	        end = System.currentTimeMillis();
	        System.out.println("RecLog2Concat: " + (end-start) + "ms");

	        start = System.currentTimeMillis();
	        for (int i = 0; i < n; i++) {
	            if(repeatR(s,i).length()!=i*l) throw new RuntimeException();
	        }               
	        end = System.currentTimeMillis();
	        System.out.println("RecLinConcat: " + (end-start) + "ms");

	        start = System.currentTimeMillis();
	        for (int i = 0; i < n; i++) {
	            if(repeatIc(s,i).length()!=i*l) throw new RuntimeException();
	        }
	        end = System.currentTimeMillis();
	        System.out.println("IterConcat: " + (end-start) + "ms");

	        start = System.currentTimeMillis();
	        for (int i = 0; i < n; i++) {
	            if(repeatSb(s,i).length()!=i*l) throw new RuntimeException();
	        }
	        end = System.currentTimeMillis();
	        System.out.println("IterStrB: " + (end-start) + "ms");
	    }

	    public static String repeatLog2(String s, int times) {
	        if (times <= 0) {
	            return "";
	        }
	        else if (times % 2 == 0) {
	            return repeatLog2(s+s, times/2);
	        }
	        else {
	           return s + repeatLog2(s+s, times/2);
	        }
	    }

	    public static String repeatR(String s, int times) {
	        if (times <= 0) {
	            return "";
	        }
	        else {
	            return s + repeatR(s, times-1);
	        }
	    }

	    public static String repeatIc(String s, int times) {
	        String tmp = "";
	        for (int i = 0; i < times; i++) {
	            tmp += s;
	        }
	        return tmp;
	    }

	    public static String repeatSb(String s, int n) {
	        final StringBuilder sb = new StringBuilder();
	        for(int i = 0; i < n; i++) {
	            sb.append(s);
	        }
	        return sb.toString();
	    }
	}
