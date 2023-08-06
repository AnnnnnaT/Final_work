public class Animal{
    static Integer typeId;
    static String type;
    
    public Animal (Integer typeId, String type){
        this.typeId = typeId;
        this.type = type;
    }

    public Integer getTypeId(){
        return this.typeId;
    }
    
    public String getType(){
        return this.type;
    }

     public String toString(){
        return "Animal's type_ID: "+ this.typeId + "n/" + "Animal's type:" + this.type;
     }

}