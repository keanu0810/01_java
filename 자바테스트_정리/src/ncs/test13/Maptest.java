package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.*;

public class Maptest {
	public static void main(String[] args) {
		Map<String, Inventory> InventoryMap = new HashMap<>();

		// 상품 정보 String 으로 어떤 핸드폰인지 작성 Inventoey 핸드폰 정보 넣기
		// 상품 정보 등록
		Calendar 캘린더 = Calendar.getInstance();
		캘린더.set(2016, 캘린더.MARCH, 15);
		InventoryMap.put("삼성 캘럭시S7",new Inventory("삼성 갤럭시S7", 캘린더.getTime(),30));
		캘린더.set(2016, 캘린더.FEBRUARY, 25);
		InventoryMap.put("Lg G5",new Inventory("Lg G5", 캘린더.getTime(),30));
		캘린더.set(2016, 캘린더.JANUARY, 23);
		InventoryMap.put("애플 아이패드 프로",new Inventory("애플 아이패드 프로", 캘린더.getTime(),30));
		//InventoryMap.put("삼성 캘럭시S7", new Inventory("삼성 갤럭시S7",new SimpleDateFormat("yyyy년MM월dd일").parse(null) ,30);
		
		
		
		
		try {
		
		캘린더.set(2016,캘린더.APRIL, 28);
		InventoryMap.get("삼성 캘럭시7").setGetDate(캘린더.getTime());// 출고 날짜
		InventoryMap.get("삼성 캘럭시7").setGetAmount(10);// 출고 개수
		
		
		InventoryMap.get("Lg G5").setGetDate(캘린더.getTime());
		InventoryMap.get("Lg G5").setGetAmount(10);
		
		InventoryMap.get("애플 아이패드 프로").setGetDate(캘린더.getTime());
		InventoryMap.get("애플 아이패드 프로").setGetAmount(10);
		
		//만약에 제품이 존재하지 않을 경우 AmountNotEnough 넣고 사용을 할 것
		for(Inventory 인벤토리 : InventoryMap.values()) {
			// 내가 가지고 있는 양보가   	< 		출고 양이 더 많을 경우
			
			// 	판매하고자 하는 양 		>		현재 가지고 있는 양
			if(인벤토리.getGetAmount() > 인벤토리.getGetAmount()) {
				throw new AmountNotEnough("출고 수량이 재고 수량을 초과했습니다.");
			}
		}
		
		} catch (AmountNotEnough e) {
			e.printStackTrace();// 에러를 출력해서 보여주기;
			
		}
		
		
		
		
		
		
		
		캘린더.set(2016,캘린더.APRIL, 28);
		
		//for-each문을 활용해서 상품 정보 출력
		for(Inventory e  	: InventoryMap.values()) {
			System.out.println(e.toString());// 삼품정보 출력
		}
		//현재는 팔린 제품이 없기 떄문에 출고일 출고 수향 남은 수량은 없음
	}
}
