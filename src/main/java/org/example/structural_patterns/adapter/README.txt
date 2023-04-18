Паттерн "Адаптер"

В данном примере класс PhoneMemoryCard не совместим с интерфейсом USB.
Класс Adapter реализует интерфейс USB и содержит поле типа PhoneMemoryCard,
что позволяет обернуть метод PhoneMemoryCard в метод USB