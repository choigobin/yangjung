menu={'컵라면':2500, '핫바':2000, '음료수':1500}
basket = dict()

def show():
    print(menu)
def add(item, number):
    check = item in basket
    if check:
        already = basket.get(item)
        basket[item]=number+already
    else:
        basket[item]=number
    print(basket)
def order():
    return basket
