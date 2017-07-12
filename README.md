КАК ЗАПУСТИТЬ ПРОЕКТ:
Скачиваем проект ввиде архива и разархивируем его(Нажимаем кнопку скачать или клонировать (Download or clone - > Download ZIP).)
Находим внутри папки tz файл fre.war , в этом заходим в командную строку или терминал (пишем cmd туда где прописан путь (Windows))
Пишем java -jar fre.war и нажимаем enter (подождем пока все запустится)
Идем в localhost:8080/hello1 и видим результат!


Чтобы изменить строку: 
Идем в localhost:8080/h2 нажимаем connect
пишем UPDATE Category SET name = 'SOMETHING'  where id=1 (вместо SOMETHING вводите свою строку) и ctrl + enter

