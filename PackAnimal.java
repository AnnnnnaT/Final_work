import java.util.ArrayList;

public class PackAnimal extends Animal{

        
    private ArrayList commands = new ArrayList<String>();

    
    public PackAnimal(Integer typeId, String type) {
        super(typeId = 2, type = "Вьючное животное" );
        
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
        return "Pack animal type_ID: "+ this.typeId + "n/" + "Pack animal type:" + this.type;
    }

    public void addCommand(String command){
        this.commands.add(command);
    }
    
    public ArrayList getCommands(){
        return commands;
    }
}
