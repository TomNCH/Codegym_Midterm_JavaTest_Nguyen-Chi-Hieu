package ContactManager;

import java.util.LinkedList;

public class ContactManagerTest {
    public static void main(String[] args) {
        LinkedList<Contact> contacts = new LinkedList<>();

        contacts.add(new Contact("Tuan","Nguyen","0943242532"));
        contacts.add(new Contact("Anh","Tran","095743734235"));
        contacts.add(new Contact("Hoang","Do","08437463746"));
        contacts.add(new Contact("Do","Tran","075364423"));
        contacts.add(new Contact("Tien","Le","075364423"));
        contacts.add(new Contact("Hoa","Ly","075364423"));
        contacts.add(new Contact("Quang","Trinh","075364423"));
        contacts.add(new Contact("Hoang","Nguyen","075364423"));

        showContact(contacts);
        System.out.println("------------");
        addNewContact(contacts, new Contact("Hung","An","09046653423"));
        addNewContact(contacts, new Contact("Son","Hoang","09954835736"));
        showContact(contacts);
        System.out.println("------------");
        modifyContact(contacts, 1, new Contact("Tuan","Le","09954835736"));
        removeContact(contacts, "08437463746");
        System.out.println("------------");
        searchContact(contacts, "lastName", "Tran");
        searchContact(contacts, "firstName", "Anh");
        searchContact(contacts, "phoneNumber", "0943242532");
    }

    public static void showContact(LinkedList<Contact> contacts){
       for (Contact contact: contacts){
           System.out.println("First Name : " + contact.getFirstName()
                            + " Last Name : " + contact.getLastName()
                            + "  Phone number : " + contact.getPhoneNumber());
       }
    }

    public static void addNewContact(LinkedList<Contact> contacts, Contact contact){
        contacts.addLast(contact);
        System.out.println("Add new Contact success !");
    }

    public static void modifyContact(LinkedList<Contact> contacts, int index, Contact modifyContact){
        try{
            contacts.add(index, modifyContact);
            contacts.remove(index + 1);
            System.out.println("Modified contact success !");
        }catch (Exception e){
            System.out.println("index is not valid");
        }

    }

    public static void removeContact(LinkedList<Contact> contacts, String phoneNumber){
        boolean check = false;
        for (int i = 0; i < contacts.size(); i++){
            if (phoneNumber.equals(contacts.get(i).getPhoneNumber())){
                contacts.remove(i);
                System.out.println("Remove contact success!");
                check = true;
            }
        }
        if (!check){
            System.out.println("Phone Number is not found!");
        }
    }

    public static void searchContact(LinkedList<Contact> contacts, String location, String input){
        for (Contact contact: contacts){
            if (location.equals("firstName")){
                if (input.equals(contact.getFirstName())){
                    System.out.println("First Name : " + contact.getFirstName()
                            + " Last Name : " + contact.getLastName()
                            + "  Phone number : " + contact.getPhoneNumber());
                }
            }
            if (location.equals("lastName")){
                if (input.equals(contact.getLastName())){
                    System.out.println("First Name : " + contact.getFirstName()
                            + " Last Name : " + contact.getLastName()
                            + "  Phone number : " + contact.getPhoneNumber());
                }
            }
            if (location.equals("phoneNumber")){
                if (input.equals(contact.getPhoneNumber())){
                    System.out.println("First Name : " + contact.getFirstName()
                            + " Last Name : " + contact.getLastName()
                            + "  Phone number : " + contact.getPhoneNumber());
                }
            }
        }
    }

}
