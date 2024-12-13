// Base class
class Publication {
    private String title;
    private double price;
    private int copies;

    public String getTitle() {
        return this.title;
    }
    public double getPrice() {
        return this.price;
    }
    public int getCopies() {
        return this.copies;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }    

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public void sellCopy(int qty) {
        if (qty > 0 && qty <= copies) {
            copies -= qty;
            System.out.println("Total Publication sell: $" + (qty * price));
        } else {
            System.out.println("Invalid quantity to sell");
        }
    }
}

// Subclass for Book
class Book extends Publication {
    private String author;

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void orderCopies(int newCopies) {
        setCopies(getCopies() + newCopies);
        System.out.println(newCopies + " copies added to Book stock.");
    }

    @Override
    public void sellCopy(int qty) {
        super.sellCopy(qty);
        System.out.println("Book-specific processing complete.");
    }
}

// Subclass for Magazine
class Magazine extends Publication {
    private int orderQty;
    private String currIssue;

    public int getOrderQty() {
        return this.orderQty;
    }
    public String getCurrIssue() {
        return this.currIssue;
    }

    public void setCurrIssue(String currIssue) {
        this.currIssue = currIssue;
    }    

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public void recvNewIssue(String newIssue) {
        setCopies(orderQty);
        currIssue = newIssue;
        System.out.println("New issue received: " + newIssue + " with " + orderQty + " copies.");
    }

    @Override
    public void sellCopy(int qty) {
        super.sellCopy(qty);
        System.out.println("Magazine-specific processing complete.");
    }
}

// Main class
class Main2 {
    public static void main(String[] args) {
        // Create and configure a Book instance
        Book book = new Book();
        book.setTitle("Java Programming");
        book.setAuthor("John Doe");
        book.setPrice(29.99);
        book.orderCopies(50);

        // Selling some books
        book.sellCopy(5);

        // Create and configure a Magazine instance
        Magazine magazine = new Magazine();
        magazine.setTitle("Tech Monthly");
        magazine.setPrice(5.99);
        magazine.setOrderQty(100);
        magazine.recvNewIssue("December 2024");

        // Selling some magazines
        magazine.sellCopy(10);
    }
}
