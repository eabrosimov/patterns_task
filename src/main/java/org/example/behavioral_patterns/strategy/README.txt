Паттерн "Стратегия"

Очень похож на пример с паттерном "состояния"
Отличие лишь в том, что логика смены стратегии выносится в класс клиент.

Класс ElvenElder характеризует профессию персонажа из игры Lineage2
Персонаж меняет свое поведение в зависимости от того какая стратегия выбрана
Если персонаж в режиме поддержки, то он может хилить и бафать других персонажей
Если персонаж в боевом режиме, то он может атаковать, но не может хилить и бафать
Если персонаж в режиме медитации, то он не может двигаться и использовать скилы,
его броня уменьшается, но зато очень быстро восстанавливается мана