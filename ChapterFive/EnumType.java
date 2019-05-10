public class EnumType {
    public static void main(String[] args){
        System.out.println(Size.SMALL.getAbbr().equals("S"));

        Size size = Size.MEDIUM;
        System.out.println(size.getAbbr());
    }


    enum Size{
        SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

        private String abbr;

        Size(String abbr){
            this.abbr = abbr;
        }

        public String getAbbr(){
            return this.abbr;
        }
    }


}
