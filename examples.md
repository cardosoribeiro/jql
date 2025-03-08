**JQL Examples:**

1.  **Simple `SELECT`:**

    ```json
    {
      "using": { "tables": ["users"] },
      "select": ["name", "email"]
    }
    ```

2.  **`WHERE` with Equality:**

    ```json
    {
      "using": { "tables": ["products"] },
      "where": { "category": "books" }
    }
    ```

3.  **`WHERE` with Operator:**

    ```json
    {
      "using": { "tables": ["orders"] },
      "where": { "order_total": { ">": 100.00 } }
    }
    ```

4.  **`WHERE` with `AND` and `OR`:**

    ```json
    {
      "using": { "tables": ["employees"] },
      "where": { "AND": [ { "department": "Sales" }, { "OR": [ { "age": { ">": 30 } }, { "city": "New York" } ] } ] }
    }
    ```

5.  **`WHERE` with `NOT`:**

    ```json
    {
      "using": { "tables": ["products"] },
      "where": { "NOT": { "category": "electronics" } }
    }
    ```

6.  **`WHERE` with `GROUP`:**

    ```json
    {
      "using": { "tables": ["users"] },
      "where": { "OR": [ { "GROUP": { "AND": [ { "age": { ">": 25 } }, { "city": "London" } ] } }, { "is_active": true } ] }
    }
    ```

7.  **`ORDER BY` (multiple columns):**

    ```json
    {
      "using": { "tables": ["products"] },
      "orderBy": [ { "category": "ASC" }, { "price": "DESC" } ]
    }
    ```

8.  **`INSERT`:**

    ```json
    {
      "using": { "tables": ["users"] },
      "insert": { "username": "testuser", "email": "test@example.com", "is_active": true }
    }
    ```

9.  **`UPDATE`:**

    ```json
    {
      "using": { "tables": ["products"] },
      "update": { "price": 29.99 },
      "where": { "product_id": 456 }
    }
    ```

10. **`DELETE`:**

    ```json
    {
      "using": { "tables": ["orders"] },
      "delete": { "order_id": 789 }
    }
    ```

