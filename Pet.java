import java.util.ArrayList;

public class Pet extends Animal{

    private ArrayList commands = new ArrayList<String>();

    public Pet(Integer typeId, String type) {
        super(typeId = 1, type = "Домашнее животное");
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return super.getType();
    }

    @Override
    public Integer getTypeId() {
        // TODO Auto-generated method stub
        return super.getTypeId();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Pet's type_ID: "+ Animal.typeId + "n/" + "Pet's type:" + this.type;
    }

    public void addCommand(String command){
        this.commands.add(command);
    }
    
    public ArrayList getCommands(){
        return commands;
    }

    

}
