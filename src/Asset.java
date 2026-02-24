public class Asset {
    private int id;
    private String name;
    private String category;
    private String status;

    public Asset(int id,String name,String category,String status){
      this.id=id;
      this.name=name;
      this.category=category;
      this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return "ID:"+id+" Name:"+ name+" category:"+category+" Status: "+status;
    }
}
