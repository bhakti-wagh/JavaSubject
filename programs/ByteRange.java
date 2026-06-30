class ByteRange {

    public static void main(String[] args) {

        long l = 0;
        byte start = (byte) l;

        boolean first = true;

        while (true) {

            byte b = (byte) l;
            System.out.println(l + " ---> " + b);

            l++;

            // Stop when byte value repeats
            if ((byte) l == start && !first) {
                break;
            }

            first = false;
        }

        System.out.println("Total values = " + l);
    }
}