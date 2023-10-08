class Node 
{
    constructor(name, phoneNumber) 
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.next = null;
        this.prev = null;
    }
}   
class PhoneDirectory 
{
    constructor() 
    {
        this.head = null;
        this.tail = null;
    }   

    addContact(name, phoneNumber)
    {
        const newNode = new Node(name, phoneNumber);
        if (!this.head)
        {
            this.head = newNode;
            this.tail = newNode;
        }
        else 
        {
            newNode.prev = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }
   
    deleteContact(name) 
    {
        let current = this.head;
        while (current)
        {    
            if (current.name.toLowerCase() === name.toLowerCase()) 
            {
                if (current === this.head) 
                {
                    this.head = current.next;
                }
                else 
                {
                    current.prev.next = current.next;
                }
                if (current === this.tail)
                {
                    this.tail = current.prev;
                }
                else 
                {
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }
   
    displayContacts() 
    {
        let current = this.head;
        if (!current)
        {
            console.log("No contacts found.");
            return;
        }
        console.log("Name\t\tPhone Number");
        console.log("----------------------------------------");
        while (current) 
        {
            console.log(current.name + "\t\t" + current.phoneNumber);
            current = current.next;
        }
        console.log("----------------------------------------");
    }
} 
const phoneDirectory = new PhoneDirectory();
const readline = require('readline');
const rl = readline.createInterface({
input: process.stdin,
output: process.stdout
});   
function promptUser() 
{
    console.log("\nEnter an option:");
    console.log("1. Add contact");
    console.log("2. Delete contact");
    console.log("3. Display contacts");
    console.log("4. Quit");
    rl.question('', function (option)
    {
        switch (option)
        {
            case '1':
            console.log("Enter name:");
            rl.question('', function (name) 
            {
                console.log("Enter phone number:");
                rl.question('', function (phoneNumber) 
                {
                    phoneDirectory.addContact(name, phoneNumber);
                    promptUser();
                });
            });
            break;
            case '2':
            console.log("Enter name of contact to delete:");
            rl.question('', function (nameToDelete) 
            {
                phoneDirectory.deleteContact(nameToDelete);
                promptUser();
            });
            break;
            case '3':
            phoneDirectory.displayContacts();
            promptUser();
            break;
            case '4':
            rl.close();
            break;
            default:
            console.log("Invalid option.");
            promptUser();
            break;
        }
    }); 
}  
promptUser();