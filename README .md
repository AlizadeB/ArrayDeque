
# Java-da ArrayDeque sinfi

Burada qısaca ArrayDeque sinfi haqqında məlumat və nümunələr öz əksini tapacaq.

## ArrayDeque strukturu

#### ArrayDeque sinfini çağırma

```http
  ArrayDeque<Tip*> dəyişənAdı = new ArrayDeque<>();
```
 *Tip - non-primitivlər (int, boolean, char ...) istifadə oluna bilməz.
İstifadə oluna bilər : `String`, `Integer`,`Long`...

## ArrayDeque sinfinin əlaqələri

![sinif əlaqələri](https://cdn.programiz.com/sites/tutorial2program/files/java-arraydeque-class.png)


ArrayDeque sinfi Queue və Deque interfeyslərindən xüsusiyyətlər miras alıb. Bu interfeyslər də Deque-Queue-Collection ardıcıllığı ilə miras alıblar. 

*`extends` və `implements` ətraflı OOP-nin təməllərində tanış ola bilərsiniz.

Java-dakı ArrayDeque, Deque interfeysinin tətbiqinə əlavə olaraq ölçüsü dəyişdirilə bilən massiv tətbiq etmək üçün bir yol təqdim edir. O, həmçinin Array Double Ended Queue və ya Array Deck kimi tanınır. Bu, böyüyən və istifadəçilərə növbənin hər iki tərəfindən element əlavə etmək və ya silmək imkanı verən xüsusi bir massiv növüdür.

![sinif əlaqələri](https://media.geeksforgeeks.org/wp-content/uploads/anod.png)

## ArrayDeque-nin mühüm xüsusiyyətləri aşağıdakılardır:
-	ArrayDeque heç bir `tutum məhdudiyyətinə malik deyil` və lazım olduqda böyüyür.
-	ArrayDeque birdən çox mövzu ilə `paralel girişi dəstəkləmir`.
-	ArrayDeque-də `null elementlər qadağandır`.
-	ArrayDeque sinfi **yığın kimi** istifadə edildikdə `Stack-dən` **daha sürətli** ola bilər.
-	ArrayDeque sinfi `növbə kimi` istifadə edildikdə `LinkedList-dən daha sürətli` ola bilər.

## ArrayDeque sinfi üçün **Big O notasiyası**

|    vəziyyətlər  | notasiyası                |
| :------- | :------------------------- |
| `əlavə etmə (offer)` | `O(1)` | 
| `seçmə (peek) ` | `O(1)` | 
| `silmə (poll)` | `O(1)` | 
| `ölçü (size)` | `O(1)` | 

## ArrayDeque sinfinə aid bəzi **metodlar**

#### Əlavə etmə metodları

| Metod    | Açıqlama                       |
| :------- | :-------------------------------- |
| `add()` | Veriləni **Deque**-nin **sonuna** əlavə edir. |
| `addFirst()` | Veriləni **Deque**-nin **əvvəlinə** əlavə edir. |
| `addLast()` | Veriləni **Deque**-nin **sonuna** əlavə edir. |
| `offer()` | Veriləni **Deque**-nin **sonuna** əlavə edir. |
| `offerFirst()` | Veriləni **Deque**-nin **əvvəlinə** əlavə edir. |
| `offerLast()` | Veriləni **Deque**-nin **sonuna** əlavə edir. |
| `push()` | Veriləni **Stack**-in **üzərinə** əlavə edir. |

#### Silmə metodları

| Metod    | Açıqlama                       |
| :------- | :-------------------------------- |
| `clear()` | **Deque**-daki **bütün** elementləri silir. |
| `poll()` | **Başdakı** veriləni geri qaytarır və silir. |
| `pollFirst()` | **Birinci** veriləni geri qaytarır və silir. |
| `pollLast()` | **Sonuncu** veriləni geri qaytarır və silir. |
| `pop()` |  **Stack**-də **üstdəki** veriləni geri qaytarır və silir. |
| `remove()` | **Başdakı** veriləni geri qaytarır və silir. |
| `removeFirst()` |**Birinci** veriləni geri qaytarır və silir.|
| `removeLast()` | **Sonuncu** veriləni geri qaytarır və silir. |

#### Seçmə metodları

| Metod    | Açıqlama                       |
| :------- | :-------------------------------- |
| `getFirst()` | **Deque**-nin **ilk** verilənini geri qaytarır. |
| `getLast()` | **Deque**-nin **son** verilənini geri qaytarır.  |
| `peek()` | **Başdakı** veriləni geri qaytarır. |
| `peekFirst()` | **Deque**-nin **ilk** verilənini geri qaytarır. |
| `peekLast()` | **Deque**-nin **son** verilənini geri qaytarır.  |

#### Digər metodlar

| Metod    | Açıqlama                       |
| :------- | :-------------------------------- |
| `size()` | **Deque**-nin *ölçüsünü* geri qaytarır. |
| `clone()` | **Deque**-ni **klonlayır.**  |
| `isEmpty()` | **Deque**-nin boş olub olmadığını geri qaytarır. |
| `toArray()` | **Deque**-ni **massivə** çevirir. |

Metodlar əlbəttəki bununla bitmir. Ətraflı məlumat üçün fərdi şəkildə axtara bilərsiniz.
