def make_change(charged, given):
    """
    Calculate the minimum number of bills and coins to give as change.
    
    Args:
        charged (float): Amount charged for the item
        given (float): Amount of money given by customer
    
    Returns:
        dict: Dictionary containing the count of each denomination
    """
    # Calculate the change amount
    change = given - charged
    
    # Handle case where no change is needed
    if change <= 0:
        print("No change needed!")
        return {}
    
    # Convert to cents to avoid floating point precision issues
    change_cents = round(change * 100)
    
    # Define denominations in cents (from largest to smallest)
    # Using common US currency denominations
    denominations = [
        (10000, "$100 bill"),    # $100
        (5000, "$50 bill"),      # $50
        (2000, "$20 bill"),      # $20
        (1000, "$10 bill"),      # $10
        (500, "$5 bill"),        # $5
        (100, "$1 bill"),        # $1
        (25, "Quarter"),         # $0.25
        (10, "Dime"),           # $0.10
        (5, "Nickel"),          # $0.05
        (1, "Penny")            # $0.01
    ]
    
    result = {}
    total_items = 0
    
    print(f"Change to give: ${change:.2f}")
    print("-" * 30)
    
    # Greedy algorithm: use largest denominations first
    for value, name in denominations:
        if change_cents >= value:
            count = change_cents // value  # Integer division
            result[name] = count
            change_cents -= count * value
            total_items += count
            print(f"{name}: {count}")
    
    print("-" * 30)
    print(f"Total bills and coins: {total_items}")
    
    return result


def main():
    """
    Main function to test the make_change function with user input.
    """
    try:
        print("=== Make Change Program ===")
        
        # Get input from user
        charged = float(input("Enter the amount charged: $"))
        given = float(input("Enter the amount given: $"))
        
        # Validate input
        if charged < 0 or given < 0:
            print("Error: Amounts cannot be negative!")
            return
        
        if given < charged:
            print("Error: Amount given is less than amount charged!")
            return
        
        # Calculate and display change
        print("\n" + "="*40)
        change_breakdown = make_change(charged, given)
        
        if change_breakdown:
            print("\nChange breakdown:")
            for denomination, count in change_breakdown.items():
                print(f"  {denomination}: {count}")
    
    except ValueError:

        print("Error: Please enter valid numbers!")

    except Exception as e:
        print(f"An error occurred: {e}")


# Test the function with sample data

if __name__ == "__main__":

    # # Sample test cases
    # print("Sample Test Cases:")
    # print("="*50)
    
    # # Test Case 1
    # print("Test 1: Charged $18.37, Given $20.00")
    # make_change(18.37, 20.00)
    # print()
    
    # # Test Case 2
    # print("Test 2: Charged $7.89, Given $10.00")
    # make_change(7.89, 10.00)
    # print()
    
    # # Test Case 3
    # print("Test 3: Charged $0.67, Given $1.00")
    # make_change(0.67, 1.00)
    # print()
    
    # Run interactive version
    print("\nInteractive Mode:")
    print("="*50)
    main()