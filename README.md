# SI_2025_lab2_233007
### **Михаил Димитровски , индекс 233007**
### **Control Flow Graph**
![cfg](https://github.com/user-attachments/assets/176c7879-fd16-4b97-9bae-5f78778ce2a4)
### **Цикломатска комплексност**
Цикломатската комплексност е 9, затоа што графот се состои од 8 региони + надворешниот , вкупно 9.
### **Тест случаи според критериумот Every statement**
Test Case 1:
Input: null, "1111-1111-1111-1111"  
RuntimeException "allItems list can't be null!"
Test Case 2:
Item with name null  
RuntimeException "Invalid item!"
Test Case 3:
Item with price < 300, discount = 0, quantity = 1  
sum = price * quantity
Test Case 4:
Item with price > 300  
subtract 30 from sum
Test Case 5:
Item with discount > 0  
apply discounted price

Минимални test cases = 5
### **Тест случаи според критериумот Multiple Condition**
За условот if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10) за да се покрие секоја можна комбинација потребни се 8 тест случаи ,а минимални случаи да се постигне критериумот се 3.

### **Unit тестови објаснување**
Every Statement
Тест 1 и 2 проверува за null исклучок.
Тест 3 проверува без попуст само на еден производ.
Тест 4 проверува кога цената е поголема од 300 , сумата е -30.
Тест 5 проверува кога има попуст.

Multiple Condition
Тест 1 проверува без попуст само на еден производ.
Тест 2 проверува кога цената е поголема од 300 , сумата е -30.
Тест 3 проверува кога цената е поголема од 300 , сумата е -30 и има попуст.
Тест 4 проверува кога имаме повеќе од 10 item-и.
