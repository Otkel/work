1.Чтобы скачать с гитхаба нажимаем кнопку скачать или клонировать (Download or clone - > Download ZIP).
2. Открываем архив и разархивируем его.
3. Скачиваем Eclipse Neon 4.6 IDE по ссылке http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/neonr
4. Устанавливаем его.
5. Нажимаем на вкладку Help (Справа внизу ) - > Eclipse Marketplace 
6. В поле Find вводим STS , нажимаем кнопку Enter , качаем отсюда Spring Tools.
7. Устанавливаем его.
8. Перезапускаем IDE.
9. Нажимаем на вкладку Window -> Perspective - > Open Perspective -> Other
10. Выбираем Spring , нажимаем OK.
11. Подробнее как установить Spring Tools можете прочитать здесь http://o7planning.org/ru/10249/install-spring-tool-suite-into-eclipse
12. Импортируем наш проект в IDE (Нажимаем File -> Open Projects From File System.. , Выбираем папку с нашим проектом )
13. Подождем пока Maven грузит свои зависимости.
14. Если у вас нет MySql workbench(Нужен для того чтобы создать базы данных и таблицу )
 Скачиваем по ссылке https://dev.mysql.com/downloads/workbench/ 
15. Если у вас нет MySql то скачиваем версию 5,7 по ссылке https://dev.mysql.com/downloads/mysql/ 
16. Устанавливаем MySql 5.7 и настраиваем базу данных на порте - 3309 , user ставим : root password ставим : root   
17. Устанавливаем MySql workbench
18. Подключаем наш MySql Database к workbench(Нажимаем на вкладку Database - > Connect to Database...) с портом : 3309 , host : localhost, password : root ,user : root 
19. Идем к окошке schemas видим схему sys , если нет создаем его нажимаем в окошке правую кнопку мыши и create scheme
20. Выполняем скрипт 
CREATE TABLE `sys`.`category` (
  `category_id` INT NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`category_id`));

INSERT INTO `sys`.`category` (`category_id`, `name`) VALUES ('1', 'Hello World!');
(для того чтобы выполнить скрипт нажимаем кнопку "+sql" который находится ниже закладки FILE , вставляем наш скрипт , нажимаем на кнопку с рисунком "молния")
21. Для того чтобы поменять строку выполняем скрипт 
`sys`.`category` SET `name`='NEW STRING' WHERE `category_id`='1'; 
где вместо 'NEW STRING' можете поставить любое значение
22.Вернемся в IDE ,  Нажимаем на наш проект и Run As -> Spring Boot App
23. Ждём когда запуститься сервер. 
24. После запуска сервера заходим в браузере по адресу: http://locahost:8080/hello1
И видим результат.

