package gardella.vik.bank;

public class Transaction {
        //Private Member Variables
        private int senderAccountID;
        private int recepientAccountID;
        private double amount;
        private boolean validity;
    
        //Constructor
        public Transaction(int sID, int rID, double amt, boolean val){
            senderAccountID = sID;
            recepientAccountID = rID;
            amount = amt;
            validity = val;
        }

        //Accessors
        public int getSenderAccountID(){return senderAccountID;}
        public int getRecepientAccountID(){return recepientAccountID;}
        public double getAmount(){return amount;}
        public boolean getValidity(){return validity;}

        //Mutators
        public void setSenderAccountID(int newSenderAccountID){senderAccountID = newSenderAccountID;}
        public void setRecepientAccountID(int newRecepientAccountID){recepientAccountID = newRecepientAccountID;}
        public void setAmount(double newAmount){amount = newAmount;}
        public void setValidity(boolean newValidity){validity = newValidity;}

        //Functions

}
