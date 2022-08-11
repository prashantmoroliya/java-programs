class InvalidProductException extends Exception {
    public InvalidProductException(String s) {
        super(s);
    }
}

class ProductTest {
    public void productCheck(int wgt) throws InvalidProductException {
        if (wgt < 100)
            throw new InvalidProductException("weight is less");
    }

    public static void main(String args[]){
            ProductTest pt = new ProductTest();
            try {
                pt.productCheck(70);
            } catch(InvalidProductException ipe) {
                System.out.println("exception caught");
                System.out.println(ipe.getMessage());
            }
        }
}
