drop table if exists manga;
drop table if exists autor;

create table manga (
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    imagen_url varchar(500)
);

insert into manga 
(id,    nombre,                    descripcion,  imagen_url) values
(1,     'Sakura Card captor', 'El peligro se avecina a Tomodea, podra Sakura capturar todas las cartas?', 'https://s4.anilist.co/file/anilistcdn/media/manga/cover/large/nx87296-4HLEXxFNZyKg.jpg'),
(2,     'Ouran Highschool Host Club', 'One day, Haruhi, a scholarship student at exclusive Ouran High School, breaks an $80,000 vase that belongs to the "Host Club," a mysterious campus group consisting of six super-rich (and gorgeous) guys. To pay back the damages, she is forced to work for the club', 'https://s4.anilist.co/file/anilistcdn/media/manga/cover/large/bx30030-zBHKa3yHdtnM.png'),
(3,     'Yu-Gi-Oh',             '10th grader Yugi spent most of his time alone playing games--until he solved the Millennium Puzzle, a mysterious Egyptian artifact! Possessed by the puzzle, Yugi becomes Yu-Gi-Oh, the King of Games','https://s4.anilist.co/file/anilistcdn/media/manga/cover/large/bx30054-cUkmb6qcrhTG.jpg'),
(4,     'Shingeki no Kyojin',   'In this post-apocalyptic sci-fi story, humanity has been devastated by the bizarre, giant humanoids known as the Titans. ','https://s4.anilist.co/file/anilistcdn/media/manga/cover/large/bx53390-h7YSU2iWytJu.jpg'),
(5,     'One Piece',  'As a child, Monkey D. Luffy was inspired to become a pirate by listening to the tales of the buccaneer "Red-Haired" Shanks. But his life changed when Luffy accidentally ate the Gum-Gum Devil Fruit and gained the power to stretch like rubber...at the cost of never being able to swim again! Years later, still vowing to become the king of the pirates, Luffy sets out on his adventure...one guy alone in a rowboat, in search of the legendary "One Piece," said to be the greatest treasure in the world...',                                                                                   'https://s4.anilist.co/file/anilistcdn/media/manga/cover/large/nx30013-sHV5ednRCXaC.jpg'),
(6,     'Bleach',  'Ichigo Kurosaki has always been able to see ghosts, but this ability doesnt change his life nearly as much as his close encounter with Rukia Kuchiki, a Soul Reaper and member of the mysterious Soul Society. While fighting a Hollow, an evil spirit that preys on humans who display psychic energy, Rukia attempts to lend Ichigo some of her powers so that he can save his family; but much to her surprise, Ichigo absorbs every last drop of her energy.',  'https://s4.anilist.co/file/anilistcdn/media/manga/cover/large/bx30012-z7U138mUaPdN.png'),
(7,     'Slam Dunk', 'Hanamichi Sakuragis got no game with girls--none at all! It doesnt help that hes known for throwing down at a moments notice and always coming out on top. A hopeless bruiser, hes been rejected by 50 girls in a row! All that changes when he meets the girl of his dreams, Haruko, and shes actually not afraid of him! When she introduces him to the game of basketball, his life is changed forever...',                              'https://s4.anilist.co/file/anilistcdn/media/manga/cover/large/bx30051-Lfej2WdOZty5.png'),
(8,     'Shaman King',  'Yoh Asakura is a shaman--one of the gifted few who, thanks to training or natural talent, can channel spirits that most people cant even see. With the help of his fiance, Anna, Yoh is in training for the ultimate shaman sports event: the "Shaman Fight in Tokyo," the once-every-500-years tournament to see who can shape humanitys future and become the Shaman King. But unfortunately for Yoh, every shaman in the world is competing for the same prize...',                                                                'https://s4.anilist.co/file/anilistcdn/media/manga/cover/large/bx30050-DwQ7Sbl8vJYU.png');

create table autor (
    id int primary key auto_increment,
    nombre varchar(200) not null
    
);

insert into autor
(id,    nombre) values
(1,     'Eiichirou Oda'),
(2,     'CLAMP' ),
(3,     'Kazuki Takahashi'),
(4,     'Bisco Hatori'),
(5,     'Hajime Isayama'),
(6,     'Tite Kubo'),
(7,     'Takehiko Inoue'),
(8,     'Hiroyuki Takei');

alter table manga
add column autor_id int,
add foreign key (autor_id) references autor(id);

update manga set autor_id = 1 where id in (5);
update manga set autor_id = 2 where id in (1);
update manga set autor_id = 3 where id in (3);
update manga set autor_id = 4 where id in (2);
update manga set autor_id = 5 where id in (4);
update manga set autor_id = 6 where id in (6);
update manga set autor_id = 7 where id in (7);
update manga set autor_id = 8 where id in (8);






alter table manga
modify autor_id int not null;
