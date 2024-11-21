package com.example.dalendar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RoutineRecommand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_recommand);

        TextView category1=findViewById(R.id.in_RtnRecommand_hobby_text1);
        TextView category2=findViewById(R.id.in_RtnRecommand_hobby_text2);
        TextView category3=findViewById(R.id.in_RtnRecommand_hobby_text3);

        //카드뷰 누르면 알람 설정 화면으로 넘어가게끔 + 카테고리 이름 알람 설정 화면으로 넘겨주기
        CardView in_RtnRecommand_card1=findViewById(R.id.in_RtnRecommand_CardView1);
        in_RtnRecommand_card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedCategory=category1.getText().toString();
                Intent intent=new Intent(RoutineRecommand.this, Routine_Maker.class);

                intent.putExtra("selectedHobby", selectedCategory);
                startActivity(intent);
            }
        });

        CardView in_RtnRecommand_card2=findViewById(R.id.in_RtnRecommand_CardView2);
        in_RtnRecommand_card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedCategory=category2.getText().toString();
                Intent intent=new Intent(RoutineRecommand.this, Routine_Maker.class);

                intent.putExtra("selectedHobby",selectedCategory);
                startActivity(intent);
            }
        });

        CardView in_RtnRecommand_card3=findViewById(R.id.in_RtnRecommand_CardView3);
        in_RtnRecommand_card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedCategory=category3.getText().toString();
                Intent intent=new Intent(RoutineRecommand.this, Routine_Maker.class);

                intent.putExtra("selectedHobby",selectedCategory);
                startActivity(intent);
            }
        });

        //취미 리스트
        String[] hobbies = { //40개
                "독서", "일기 쓰기", "요리", "등산",
                "사진 촬영", "여행", "정원 가꾸기",
                "음악 감상", "그림 그리기", "자원봉사",

                "영화 감상", "자전거 타기", "댄스", "DIY",
                "수영", "요가", "악기 연주",
                "블로그 쓰기", "스케이트보드", "패션 디자인",

                "공예", "글쓰기", "낚시", "패들 보드",
                "스피치", "애완동물 돌보기", "퍼즐 맞추기",
                "서예", "요가 및 명상", "마술 배우기",

                "스케치", "보드게임", "바느질", "글램핑",
                "사격", "크로스핏", "디지털 아트",
                "요가", "악세사리 만들기", "음악 제작"
        };
        //취미 한 줄 설명 리스트
        String[] descriptions = { //40개
                "책을 읽는 것은 작가와 소통하는 멋진 경험입니다.",
                "기록을 하는 것은 삶을 돌아볼 기회를 줍니다.",
                "새로운 요리를 시도하며 창의력을 발휘해보세요.",
                "자연과 함께 시간을 보내는 즐거움은 큽니다.",
                "사진은 순간을 영원히 간직할 수 있는 방법입니다.",
                "새로운 장소를 탐험하며 다양한 문화를 경험해보세요.",
                "식물을 키우며 자연의 아름다움을 느끼고 스트레스를 해소할 수 있습니다.",
                "음악은 감정을 표현하고, 편안한 시간을 제공해줍니다.",
                "창의력을 발휘하여 자신의 감정을 색으로 표현해보세요.",
                "다른 사람들을 도우며 보람을 느끼고, 사회에 긍정적인 영향을 미칠 수 있습니다.",

                "다양한 장르의 영화를 통해 새로운 이야기와 감정을 경험해보세요.",
                "자전거를 타며 건강을 챙기고, 자연을 만끽할 수 있습니다.",
                "음악에 맞춰 몸을 움직이며 스트레스를 해소하고 즐거움을 느껴보세요.",
                "직접 손으로 물건을 만들며 창의력을 발휘하고 성취감을 느낄 수 있습니다.",
                "수영은 전신 운동으로 건강을 유지하며 물에서의 자유로움을 즐길 수 있습니다.",
                "요가는 마음을 안정시키고 몸과 마음의 균형을 맞추는 데 도움을 줍니다.",
                "악기를 배워 음악을 만들며 감성을 표현할 수 있는 기회를 제공합니다.",
                "자신의 생각과 경험을 글로 남기며 다른 사람들과 소통할 수 있습니다.",
                "스케이트보드를 타며 균형 감각을 기르고 새로운 기술을 배워보세요.",
                "자신만의 스타일을 표현하며 창의력을 발휘할 수 있는 기회를 제공합니다.",

                "다양한 재료로 창의적인 작품을 만들어보며 손재주를 발휘할 수 있습니다.",
                "자신의 생각과 이야기를 글로 표현하며 창의력을 키울 수 있습니다.",
                "자연 속에서 조용히 시간을 보내며 인내심과 집중력을 기를 수 있습니다.",
                "물 위에서 균형을 잡으며 운동과 여유를 동시에 즐길 수 있습니다.",
                "사람들 앞에서 말하는 능력을 키우며 자신감을 얻을 수 있습니다.",
                "반려동물과의 교감을 통해 책임감을 느끼고 사랑을 나눌 수 있습니다.",
                "다양한 퍼즐을 풀며 문제 해결 능력과 집중력을 키울 수 있습니다.",
                "글씨를 아름답게 쓰며 집중력과 인내심을 기를 수 있는 취미입니다.",
                "마음을 차분하게 하고 스트레스를 해소하며 내면의 평화를 찾을 수 있습니다.",
                "마술을 배우며 창의력을 발휘하고 사람들을 즐겁게 할 수 있습니다.",

                "간단한 도구로 주변의 모습을 그리며 관찰력을 키울 수 있습니다.",
                "친구나 가족과 함께 보드게임을 즐기며 소통과 협력을 배울 수 있습니다.",
                "다양한 천과 실로 직접 옷이나 소품을 만들어 보는 재미가 있습니다.",
                "자연 속에서 편안한 캠핑을 즐기며 스트레스를 해소할 수 있습니다.",
                "정밀한 목표 조준을 통해 집중력과 인내심을 기를 수 있는 스포츠입니다.",
                "다양한 운동을 조합하여 체력을 키우고 건강한 라이프스타일을 유지할 수 있습니다.",
                "컴퓨터와 태블릿을 활용하여 창의적인 작품을 만들어보세요.",
                "몸과 마음의 균형을 맞추며 유연성을 기를 수 있는 좋은 방법입니다.",
                "자신만의 스타일을 표현할 수 있는 악세사리를 만들어보세요.",
                "디지털 소프트웨어를 사용하여 자신만의 곡을 만들어보는 재미가 있습니다."

        };
        //배경색 리스트 40개
        int[] colors = {
                0xFFB05B6D, 0xFFD1A0B5, 0xFFC3A3B7, 0xFF9B8B9B, 0xFF7A4F7C,
                0xFF4B3A4B, 0xFFA4B863, 0xFFD3D8A0, 0xFFC2C5B4, 0xFFB1C2A8,
                0xFF9FB1B1, 0xFF5B7A7B, 0xFF3D4D4D, 0xFF3F4D4D, 0xFF5B6B8B,
                0xFF5C6E7B, 0xFF5A7B8A, 0xFF4D5D7A, 0xFF3E3F4B, 0xFF6A6B6B,
                0xFF7B7B7F, 0xFF8B8B8B, 0xFF8C6B6B, 0xFF5D5D5D, 0xFF4B4A4B,
                0xFF4C4C4C, 0xFF3B3B3B, 0xFF2E2E2E, 0xFF1A1A1A, 0xFF0D0D0D,
                0xFF7F8B7B, 0xFFB3A5B3, 0xFF7F6B7F, 0xFF5D4B5D, 0xFF3E3A3B,
                0xFF4B7A6B, 0xFF5A7B7B, 0xFF7F6B7B, 0xFF7B5E7B
        };


        //새로고침 누르면 카드뷰 내용과 색깔 랜덤하게 변동
        CardView hobbyCard1=findViewById(R.id.in_RtnRecommand_CardView1);
        CardView hobbyCard2=findViewById(R.id.in_RtnRecommand_CardView2);
        CardView hobbyCard3=findViewById(R.id.in_RtnRecommand_CardView3);

        TextView hobbyText1=findViewById(R.id.in_RtnRecommand_hobby_text1);
        TextView hobbyDescript1=findViewById(R.id.in_RtnRecommand_hobby_descript1);

        TextView hobbyText2=findViewById(R.id.in_RtnRecommand_hobby_text2);
        TextView hobbyDescript2=findViewById(R.id.in_RtnRecommand_hobby_descript2);

        Button refreshBtn=findViewById(R.id.in_RtnRecommand_refreshButton);

        Random random = new Random();

        // 초기화
        int initialIndex1 = random.nextInt(hobbies.length);
        hobbyCard1.setBackgroundTintList(null);
        hobbyCard1.setCardBackgroundColor(colors[initialIndex1]);

        int initialIndex2 = random.nextInt(hobbies.length);
        hobbyCard2.setBackgroundTintList(null);
        hobbyCard2.setCardBackgroundColor(colors[initialIndex2]);


        int initialIndex3 = random.nextInt(colors.length);
        hobbyCard3.setBackgroundTintList(null);
        hobbyCard3.setCardBackgroundColor(colors[initialIndex3]);

        refreshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Set<Integer> usedIndexes = new HashSet<>();
                Random random = new Random();


                //첫번째 카드 변신
                int index1=randomIndex(usedIndexes,hobbies.length,random);
                int colorIndex1 = random.nextInt(colors.length);
                hobbyCard1.setCardBackgroundColor(colors[colorIndex1]);
                hobbyText1.setText(hobbies[index1]);
                hobbyDescript1.setText(descriptions[index1]);

                //두번째 카드 변신
                int index2=randomIndex(usedIndexes,hobbies.length,random);
                int colorIndex2 = random.nextInt(colors.length);
                hobbyCard2.setCardBackgroundColor(colors[colorIndex2]);
                hobbyText2.setText(hobbies[index2]);
                hobbyDescript2.setText(descriptions[index2]);

                //나만의 취미는 색만 바꾸기
                int colorIndex3 = random.nextInt(colors.length);
                hobbyCard3.setCardBackgroundColor(colors[colorIndex3]);
            }
            //인덱스 중복 방지
            private int randomIndex(Set<Integer>usedIndexes, int maxSize, Random random ){
                if (usedIndexes.size() >= maxSize) {
                    usedIndexes.clear(); // 모든 인덱스가 사용된 경우 다시 초기화
                }
                int index;
                do {
                    index = random.nextInt(maxSize);
                } while (usedIndexes.contains(index));
                usedIndexes.add(index);
                return index;
            }
        });


    }
}