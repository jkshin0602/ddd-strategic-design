# 키친포스

## 퀵 스타트

```sh
cd docker
docker compose -p kitchenpos up -d
```

## 요구 사항

### 상품

- 상품을 등록할 수 있다.
- 상품의 가격이 올바르지 않으면 등록할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 이름이 올바르지 않으면 등록할 수 없다.
    - 상품의 이름에는 비속어가 포함될 수 없다.
- 상품의 가격을 변경할 수 있다.
- 상품의 가격이 올바르지 않으면 변경할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 가격이 변경될 때 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 크면 메뉴가 숨겨진다.
- 상품의 목록을 조회할 수 있다.

### 메뉴 그룹

- 메뉴 그룹을 등록할 수 있다.
- 메뉴 그룹의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴 그룹의 이름은 비워 둘 수 없다.
- 메뉴 그룹의 목록을 조회할 수 있다.

### 메뉴

- 1 개 이상의 등록된 상품으로 메뉴를 등록할 수 있다.
- 상품이 없으면 등록할 수 없다.
- 메뉴에 속한 상품의 수량은 0 이상이어야 한다.
- 메뉴의 가격이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴는 특정 메뉴 그룹에 속해야 한다.
- 메뉴의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 이름에는 비속어가 포함될 수 없다.
- 메뉴의 가격을 변경할 수 있다.
- 메뉴의 가격이 올바르지 않으면 변경할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴를 노출할 수 있다.
- 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 높을 경우 메뉴를 노출할 수 없다.
- 메뉴를 숨길 수 있다.
- 메뉴의 목록을 조회할 수 있다.

### 주문 테이블

- 주문 테이블을 등록할 수 있다.
- 주문 테이블의 이름이 올바르지 않으면 등록할 수 없다.
    - 주문 테이블의 이름은 비워 둘 수 없다.
- 빈 테이블을 해지할 수 있다.
- 빈 테이블로 설정할 수 있다.
- 완료되지 않은 주문이 있는 주문 테이블은 빈 테이블로 설정할 수 없다.
- 방문한 손님 수를 변경할 수 있다.
- 방문한 손님 수가 올바르지 않으면 변경할 수 없다.
    - 방문한 손님 수는 0 이상이어야 한다.
- 빈 테이블은 방문한 손님 수를 변경할 수 없다.
- 주문 테이블의 목록을 조회할 수 있다.

### 주문

- 1개 이상의 등록된 메뉴로 배달 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 포장 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 매장 주문을 등록할 수 있다.
- 주문 유형이 올바르지 않으면 등록할 수 없다.
- 메뉴가 없으면 등록할 수 없다.
- 매장 주문은 주문 항목의 수량이 0 미만일 수 있다.
- 매장 주문을 제외한 주문의 경우 주문 항목의 수량은 0 이상이어야 한다.
- 배달 주소가 올바르지 않으면 배달 주문을 등록할 수 없다.
    - 배달 주소는 비워 둘 수 없다.
- 빈 테이블에는 매장 주문을 등록할 수 없다.
- 숨겨진 메뉴는 주문할 수 없다.
- 주문한 메뉴의 가격은 실제 메뉴 가격과 일치해야 한다.
- 주문을 접수한다.
- 접수 대기 중인 주문만 접수할 수 있다.
- 배달 주문을 접수되면 배달 대행사를 호출한다.
- 주문을 서빙한다.
- 접수된 주문만 서빙할 수 있다.
- 주문을 배달한다.
- 배달 주문만 배달할 수 있다.
- 서빙된 주문만 배달할 수 있다.
- 주문을 배달 완료한다.
- 배달 중인 주문만 배달 완료할 수 있다.
- 주문을 완료한다.
- 배달 주문의 경우 배달 완료된 주문만 완료할 수 있다.
- 포장 및 매장 주문의 경우 서빙된 주문만 완료할 수 있다.
- 주문 테이블의 모든 매장 주문이 완료되면 빈 테이블로 설정한다.
- 완료되지 않은 매장 주문이 있는 주문 테이블은 빈 테이블로 설정하지 않는다.
- 주문 목록을 조회할 수 있다.

## 용어 사전

### 상품

| 한글명   | 영문명           | 설명                                  |
|-------|---------------|-------------------------------------|
| 상품    | product       | 키친 포스에서 주문할 수 있는 상품을 말한다.           |
| 상품 가격 | product price | 상품의 가격을 나타낸다.                       |
| 상품 이름 | product name  | 상품의 이름을 나타낸다. 상품 이름에는 비속어가들어갈 수 없다. |
| 비속어   | slang         | 비속어를 지칭한다.                          |

### 메뉴

| 한글명           | 영문명                   | 설명                                               |
|---------------|-----------------------|--------------------------------------------------|
| 메뉴            | menu                  | 키친 포스에서 주문할 수 있는 메뉴를 나타낸다. 1개 이상의 상품들로 이루어져 있다.  |
| 메뉴 전시 상태      | display status        | 메뉴 전시 상태를 나타낸다. 전시 상태는 변경이 가능하다.                 |
| 메뉴 전시         | displayed             | 메뉴가 전시된 상태를 나타낸다.                                |
| 메뉴 비전시        | undisplayed           | 메뉴가 비전시된 상태를 나타낸다.                               |
| 메뉴 가격         | menu price            | 메뉴의 가격을 나타낸다. 메뉴의 가격은 속해있는 상품들의 총 가격의 합과 다를 수 있다. |
| 메뉴에 속한 상품     | menu product          | 메뉴에 속한 상품을 나타낸다. 메뉴에는 1개 이상의 menu product가 존재한다. |
| 메뉴에 속한 상품의 수량 | menu product quantity | 메뉴에 속한 상품의 개수를 나타낸다.                             |
| 비속어           | slang                 | 비속어를 지칭한다.                                       |

### 주문 

| 한글명   | 영문명             | 설명                                                                                   |
|-------|-----------------|--------------------------------------------------------------------------------------|
| 주문    | order           | 키친 포스에서 주문한 주문을 나타낸다.                                                                |
| 주문 유형 | order type      | 주문의 유형을 나타낸다. 주문의 유형은 DELIVERY, TAKEOUT, EAT_IN 가 존재한다.                              |
| 배달 주문 | delivery order  | 주문 유형 중 배달 유형을 의미한다.                                                                 |
| 포장 주문 | takeout order   | 주문 유형 중 포장 유형을 의미한다.                                                                 |
| 매장 주문 | eat in order    | 주문 유형 중 매장 내 식사 유형을 의미한다.                                                            |
| 주문 상태 | order status    | 주문의 현재 상태를 의미한다. WAITING, ACCEPTED, SERVED, DELIVERING, DELIVERED, COMPLETED 가 존재한다. |
| 주문 상품 | order line item | 주문에 포함되어 있는 메뉴 정보이다. 메뉴에는 상품이 1개 이상 속해있다. 주문 상품은 주문에 반드시 1개 이상 존재한다.                 |
| 주문 시간 | order date time | 주문이 생성된 시간이다.                                                                        |
| 주문 가격 | order price     | 해당 주문의 가격이다.                                                                         |

### 배달 주문

| 한글명    | 영문명             | 설명                                 |
|--------|-----------------|------------------------------------|
| 배달 대행사 | delivery agency | 배달 주문을 배달할 대행사를 나타낸다.              |
| 배달 주소  | address         | 배달 될 주소를 나타낸다.                     |
| 배달 가격  | order price     | 배달 될 주문의 가격을 나타낸다.                 |
| 주문 대기  | waiting         | 신규 주문이 들어오고 아직 수락되지 않은 상태이다.       |
| 주문 수락  | accepted        | 신규 주문을 수락하고, 배달 대행사에 배달 요청을 한 상태이다. |
| 서빙     | served          | 배달 기사에게 음식이 전달된 상태이다.              |
| 배달 중   | delivering      | 배달 기사가 음식을 배달 중인 상태이다.             |
| 배달 완료  | delivered       | 배달 기사가 음식을 손님에게 전달 완료한 상태이다.       |
| 주문 완료  | completed       | 주문이 완료된 상태이다.                      |

### 매장 주문

| 한글명   | 영문명       | 설명                             |
|-------|-----------|--------------------------------|
| 주문 대기 | waiting   | 손님이 테이블을 점유하고, 주문한 상태이다.       |
| 주문 수락 | accepted  | 신규 주문을 수락한 상태이다.               |
| 서빙    | served    | 음식이 손님에게 전달된 상태이다.             |
| 주문 완료 | completed | 손님이 식사를 마치고 나간 상태이다.           |
| 테이블   | order table     | 매장 내 테이블이다. 매장 내 식사만 이용할 수 있다. |

### 포장 주문

| 한글명   | 영문명         | 설명                       |
|-------|-------------|--------------------------|
| 주문 대기 | waiting         | 신규 주문이 들어오고 아직 수락되지 않은 상태이다. |
| 주문 수락 | accepted        | 신규 주문을 수락한 상태이다.         |
| 서빙    | served          | 음식이 손님에게 전달된 상태이다.       |
| 주문 완료 | completed       | 주문이 완료된 상태이다.            |

### 테이블

| 한글명     | 영문명              | 설명                       |
|---------|------------------|--------------------------|
| 테이블     | order table      | 매장 내 테이블을 나타낸다.          |
| 테이블 상태  | table status     | 매장 내 테이블의 점유 상태를 나타낸다.   |
| 테이블 비점유 | unoccupied table | 테이블을 점유하지 않은 상태이다.       |
| 테이블 점유 | occupied table   | 테이블의 점유한 상태이다.           |
| 테이블 손님 수 | num of guest     | 테이블에 있는 손님의 수를 의미한다.     |
| 테이블 앉기  | sit              | 테이블에 앉는 행동을 의미한다.        |
| 테이블 치우기 | clear            | 테이블 이용을 마치고 치우는 것을 의미한다. |

## 모델링
