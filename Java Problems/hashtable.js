class HashTable 
{
    constructor(size) 
    {
            this.table = new Array(size);
            this.size = size;
        }
        hash(key) {
            let total = 0;
            for (let i = 0; i < key.length; i++) {
                total += key.charCodeAt(i);
            }
            return total % this.size;
        }
        set(key, value) {
            const index = this.hash(key);
            this.table[index] = value;
        }
        get(key) {
            const index = this.hash(key);
            return this.table[index];
        }
        remove(key) {
            const index = this.hash(key);
            this.table[index] = undefined;
        }
        display() {
            console.log("KEY", "Values");
            for (let i = 0; i < this.table.length; i++) {
                if (this.table[i]) {
                    console.log(i, this.table[i]);
                }
            }
        }
    }
    const t = new HashTable(10);
    t.set("name", "Tushar");
    t.set("age", 21)
    t.set("address", "pune");
    t.set("mobno", 9637846281);
    t.display();
    console.log("\nsearch key:");
    t.get(7);
    t.display();
    console.log("\nREMOVE:");
    t.remove("mobno");
    t.display();