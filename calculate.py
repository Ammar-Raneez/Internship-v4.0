def get_input():
    while True:
        try:
            numbers = input("Enter numbers, separated by commas: ")
            arr = []
            for num in numbers.split(", "):
                arr.append(int(num))
            return arr
        except:
            print("Invalid input, Please try again")

def calculate_total():
    first_input = get_input()
    second_input = get_input()
    
    if len(first_input) != len(second_input):
        raise Exception("Inputs were different in length")
    total = []
    for i in range(len(first_input)):
        total.append(first_input[i] + second_input[i])
    print("Total: ", total)

calculate_total()
