public class Artwork{
    private String title;
    private String artist;
    private int price;
    private String nft;

    public Artwork (String title, String artist, int price, String nft){
    this.title = title;
    this.artist = artist;
    this.price = 0;
    this.nft = nft;
    }
    public String getTitle (){
        return this.title;}
        public void setTitle (String title){
        this.title = title;}

    public String getArtist (){
        return this.artist;}
        public void setArtist (String artist){
        this.artist = artist;}

     public int getPrice (){
         return this.price;}
            public void setPrice (int price){
            this.price = price;}

    public String getNft (){
        return this.nft;}
        public void setNft (String nft){
        this.nft = nft;}




}
