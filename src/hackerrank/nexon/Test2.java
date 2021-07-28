package hackerrank.nexon;

class Account implements OnlineAccount, Comparable<Account> {

    int noOfRegularMovies, noOfExclusiveMovies;
    String ownerName;

    private int totalPrice = 0;

    // 1) Add a parameterized constructor that initializes the attributes noOfExclusiveMovies and noOfExclusiveMovies.
    Account(String name, int noOfRegularMovies, int noOfExclusiveMovies) {
        this.ownerName = name;
        this.noOfRegularMovies = noOfRegularMovies;
        this.noOfExclusiveMovies = noOfExclusiveMovies;
        totalPrice = basePrice + (noOfExclusiveMovies * exclusiveMoviePrice) + (noOfRegularMovies * regularMoviePrice);
    }


    // 2. This method returns the monthly cost for the account.
    public int monthlyCost() {
        return totalPrice;
    }

    // 3. Override the compareTo method of the Comparable interface such that two accounts can be compared based on their monthly cost.

    // 4. Returns "Owner is [ownerName] and monthly cost is [monthlyCost] USD."
    public String toString() {
        return String.format("Owner is %s and monthly cost is %d USD.", ownerName, totalPrice);
    }

    @Override
    public int compareTo(Account o) {
        return this.totalPrice - o.totalPrice;
    }
}

