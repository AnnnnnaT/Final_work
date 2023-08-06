import java.util.ArrayList;

public class Donkey extends PackAnimal{

    String name;
    String  birthDate;

    public Donkey ( String name,String  birthDate) {
        super(typeId, type);
    }
     

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    
    public void setBirthDate(String  birthDate){
        this.birthDate = birthDate;
    }

    public String getBirthDate(){
        return this.birthDate;
    }


    @Override
    public void addCommand(String command) {
        // TODO Auto-generated method stub
        super.addCommand(command);
    }

    @Override
    public ArrayList getCommands() {
        // TODO Auto-generated method stub
        return super.getCommands();
    }

    @Override
    public String getType(){
        return super.getType();
    }

    @Override
    public Integer getTypeId() {

        return super.getTypeId();
    }

    @Override
    public String toString() {
        return "Donkey's type_ID: "+ this.typeId + "n/" + "Donkey's animal type:" + this.type + "n/" +
        "Donkey's name is " + this.name + "n/" + this.name + "was born " + this.birthDate + "n/" + 
        this.name + "can: " + getCommands();
    
    }

}
