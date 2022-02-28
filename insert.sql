SET foreign_key_checks=1;

USE amethystdb;

INSERT INTO mst_user(user_name,password,family_name,first_name,family_name_kana,first_name_kana,gender) VALUES 
('reona@sample.com','reonapw','王女','レオナ','オウジョ','レオナ',1),
('yuusya@sample.com','yuusyapw','町野','勇者','マチノ','ユウシャ',0),
('link@test.com','linkpw','zerudano','link','ゼルダノ','リンク',0),
('madoushi@test.com','madoushipw','sugoi','madoushi','スゴイ','マドウシ',1);

INSERT INTO mst_category(category_name,category_description) VALUES 
('武器','敵への与えるダメージが増える'),
('防具','ダメージを軽減する'),
('アイテム','ダメージを回復する');

INSERT INTO mst_product(product_name,product_name_kana,product_description,category_id,price,image_full_path,release_date,release_company) VALUES 
('棍棒','コンボウ','手に持って殴打するための武器',1,100,'/img/konbo.png','1993/12/18','スクウェア・エニックス'),
('銅の剣','ドウノツルギ','シンプルかつ扱いやすい剣',1,300,'/img/dounoturugi.png','1993/12/18','スクウェア・エニックス'),
('パルテナの神弓','パルテナノシンキュウ','威力の高い弓',1,25000,'/img/palutena.jpg','2022/2/14','任天堂'),
('ロトの剣','ロトノツルギ','非常に攻撃力が高い剣',1,30000,'/img/roto.jpg','2022/2/14','スクウェア・エニックス'),
('お鍋の蓋','オナべノフタ','守備力は最低クラス',2,100,'/img/onabenohuta.jpg','2022/2/15','スクウェア・エニックス'),
('ダイヤの鎧','ダイヤノヨロイ','防御力はあまり高くない',2,1000,'/img/daiyanoyoroi.jpg','2022/2/15','スクウェア・エニックス'),
('薬草','ヤクソウ','HPが回復する',3,500,'/img/yakusou.jpg','2021/2/14','gggg'),
('特薬草','トクヤクソウ','HPがかなり回復する',3,2000,'/img/tokuyakusou.jpg','2021/2/14','hhhh'),
('フェニックスの尾','フェニックスノオ','戦闘不能から蘇生する',3,8000,'/img/phoenix.jpg','2021/2/14','iiii');

INSERT INTO mst_destination(user_id,family_name,first_name,tel_number,address,status) VALUES 
(1,'oujo','reona','000‐0000-0000','パプニカ王国1-1-1',1),
(1,'oujo','reona','111-1111-1111','ムーンブルク1-1-1',0),
(2,'町野','勇者','012‐3456‐7890','アルパカの町2-2-2',1),
(2,'zerudano','link','1986-221-2022','ハイラル王国2-2-1',1),
(3,'sugoi','madoushi','987-6543-2100','dddd',1);
