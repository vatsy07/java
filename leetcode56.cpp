class Solution {
public:

    class node {
    public:
        int num1, num2;
        node* link;

        node(int a, int b) {
            num1 = a;
            num2 = b;
            link = NULL;
        }
    };

    class stck {
    public:
        node* head = NULL;

        void push(int a, int b) {

            node* prev = NULL;
            node* curr = head;

            while (curr != NULL) {

                if (a == b) {
                    if (a >= curr->num1 && a <= curr->num2) return;
                }

                if (a >= curr->num1 && b <= curr->num2) return;

                if (a <= curr->num1 && b >= curr->num2) {
                    a = min(a, curr->num1);
                    b = max(b, curr->num2);

                    if (prev == NULL) {
                        head = curr->link;
                        curr = head;
                    } else {
                        prev->link = curr->link;
                        curr = prev->link;
                    }
                    continue;
                }

                if (!(b < curr->num1 || a > curr->num2)) {
                    a = min(a, curr->num1);
                    b = max(b, curr->num2);

                    if (prev == NULL) {
                        head = curr->link;
                        curr = head;
                    } else {
                        prev->link = curr->link;
                        curr = prev->link;
                    }
                    continue;
                }

                prev = curr;
                curr = curr->link;
            }

            node* newNode = new node(a, b);
            newNode->link = head;
            head = newNode;
        }

        vector<vector<int>> getResult() {
            vector<vector<int>> res;
            node* temp = head;

            while (temp != NULL) {
                res.push_back({temp->num1, temp->num2});
                temp = temp->link;
            }

            sort(res.begin(), res.end());
            return res;
        }
    };

    vector<vector<int>> merge(vector<vector<int>>& intervals) {

        int n = intervals.size();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int d1 = intervals[i][1] - intervals[i][0];
                int d2 = intervals[j][1] - intervals[j][0];

                if (d2 > d1) {
                    swap(intervals[i], intervals[j]);
                }
            }
        }

        stck s;

        for (auto &x : intervals) {
            s.push(x[0], x[1]);
        }

        return s.getResult();
    }
};