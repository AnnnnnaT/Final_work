import java.util.Scanner;
public class Menu {
  
        public static void showMenu(){
            System.out.println("Menu: +n/");
            System.out.println("1. Завести  новое животное +n/");
            System.out.println("2. Увидеть список команд, которые выполняет животное +n/");
            System.out.println("3. Обучить животное новым командам +n/");
            System.out.println("4. Навигация по Меню");
        }
        
        public static void chooseAction(Animal animal){
            Scanner iscan = new Scanner(System.in);
            Integer choice = iscan.nextInt();
            switch(choice){
                case(1):
                    Menu.addAnimal();
                    break;
                case(2):
                    Menu.showCommands(animal);
                    break;
                case(3):
                    Menu.teach_command(animal);
                case(4):
                    Menu.showMenu();
                    Menu.chooseAction(animal);
                    break;
                default:
                    Menu.showMenu();
                    Menu.chooseAction(animal);
                    break;                    
            }
        }
          




        public static void addAnimal(){
            Scanner request = new Scanner(System.in);
            System.out.println("What type of animal do you want to add to register: pet (input 1) or pack animal(input 2)? ");
            Integer typeAnimal = request.nextInt();        


            if (typeAnimal == 1){
                System.out.println("What animal do you want to add: Хомяк(1), Кот(2), Собака(3)? ");
                Scanner typeAnimal_= new Scanner(System.in);
                Integer typeAnimal_1 =  typeAnimal_.nextInt();

                switch(typeAnimal_1){
                    case(1):
                    System.out.println("Введите имя хомяка");
                    Scanner h1 = new Scanner(System.in);
                    String name = h1.nextLine();

                    System.out.println("Введите команды для хомяка");
                    Scanner h2 = new Scanner(System.in);
                    String command = h2.nextLine();

                    System.out.println("Введите дату рождения хомяка");
                    Scanner h3 = new Scanner(System.in);
                    String birthDay = h3.nextLine();

                    System.out.println("Введите номер хомяка");
                    Scanner h4 = new Scanner(System.in);
                    Integer id = h4.nextInt();

                    Registry.add_hamster(name, command, birthDay, id);
                    break;

                    case(2):
                    System.out.println("Введите имя кота");
                    Scanner c1 = new Scanner(System.in);
                    String name1 = c1.nextLine();

                    System.out.println("Введите команды для кота");
                    Scanner c2 = new Scanner(System.in);
                    String command1 = c2.nextLine();

                    System.out.println("Введите дату рождения кота");
                    Scanner c3 = new Scanner(System.in);
                    String birthDay1 = c3.nextLine();

                    System.out.println("Введите номер кота");
                    Scanner c4 = new Scanner(System.in);
                    Integer id1 = c4.nextInt();

                    Registry.add_cat(name1, command1, birthDay1, id1);
                    break;

                    case(3):

                    System.out.println("Введите имя собаки");
                    Scanner d1 = new Scanner(System.in);
                    String name2 = d1.nextLine();

                    System.out.println("Введите команды для собаки");
                    Scanner d2 = new Scanner(System.in);
                    String command2 = d2.nextLine();

                    System.out.println("Введите дату рождения собаки");
                    Scanner d3 = new Scanner(System.in);
                    String birthDay2 = d3.nextLine();

                    System.out.println("Введите номер собаки");
                    Scanner d4 = new Scanner(System.in);
                    Integer id2 = d4.nextInt();

                    Registry.add_dog(name2, command2, birthDay2, id2);
                    break;

                    default:
                        Menu.addAnimal();
                        break;                    
            }
            }else{
                System.out.println("What animal do you want to add: Осел(1), Верблюд(2), Лошадь(3)? ");
                Scanner typeAnimal_= new Scanner(System.in);
                Integer typeAnimal_1 =  typeAnimal_.nextInt();

                switch(typeAnimal_1){
                    case(1):
                    System.out.println("Введите имя осла");
                    Scanner d1 = new Scanner(System.in);
                    String name = d1.nextLine();

                    System.out.println("Введите команды для осла");
                    Scanner d2 = new Scanner(System.in);
                    String command = d2.nextLine();

                    System.out.println("Введите дату рождения осла");
                    Scanner d3 = new Scanner(System.in);
                    String birthDay = d3.nextLine();

                    System.out.println("Введите номер осла");
                    Scanner d4 = new Scanner(System.in);
                    Integer id = d4.nextInt();

                    Registry.add_donkey(name, command, birthDay, id);
                    break;

                    case(2):
                    System.out.println("Введите имя верблюда");
                    Scanner c1 = new Scanner(System.in);
                    String name1 = c1.nextLine();

                    System.out.println("Введите команды для верблюда");
                    Scanner c2 = new Scanner(System.in);
                    String command1 = c2.nextLine();

                    System.out.println("Введите дату рождения верблюда");
                    Scanner c3 = new Scanner(System.in);
                    String birthDay1 = c3.nextLine();

                    System.out.println("Введите номер верблюда");
                    Scanner c4 = new Scanner(System.in);
                    Integer id1 = c4.nextInt();

                    Registry.add_camel(name1, command1, birthDay1, id1);
                    break;

                    case(3):

                    System.out.println("Введите имя лошади");
                    Scanner h1 = new Scanner(System.in);
                    String name2 = h1.nextLine();

                    System.out.println("Введите команды для лошади");
                    Scanner h2 = new Scanner(System.in);
                    String command2 = h2.nextLine();

                    System.out.println("Введите дату рождения лошади");
                    Scanner h3 = new Scanner(System.in);
                    String birthDay2 = h3.nextLine();

                    System.out.println("Введите номер лошади");
                    Scanner h4 = new Scanner(System.in);
                    Integer id2 = h4.nextInt();

                    Registry.add_horse(name2, command2, birthDay2, id2);
                    break;

                    default:
                        Menu.addAnimal();
                        break;                    

            }
            }
        }



         public static void teach_command(Animal animal){

            Scanner i = new Scanner(System.in);
            System.out.println("What do you want to teach your pet? ");
            String command = i.nextLine();

            Integer type = animal.getTypeId();
            if(type == 1){
                ((Pet) animal).addCommand(command);
            }else{
                ((PackAnimal) animal).addCommand(command);
            }

            System.out.println("Pet has been tought");
       
    
        }

        public static void showCommands(Animal animal){
            System.out.println("Команды животного: +n/");
            Integer type = animal.getTypeId();
            if(type == 1){
                ((Pet) animal).getCommands();
            }else{
                ((PackAnimal) animal).getCommands();
            }
        }


}
