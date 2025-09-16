public class tables extends Ikia {

    float price = 34.87f;
    
    tables (float price) {
        super();
        this.price = price;
    }

    @Override
    protected String price(){
        return "The price is:"+this.price;
    }
    
}
