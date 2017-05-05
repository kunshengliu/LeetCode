package something.LRU;       
    public class LRU {  
        /** 
         * �ڴ��ĸ��� 
         */  
        public static final int N = 5;  
        /** 
         * �ڴ������ 
         */  
        Object[] array = new Object[N];  
        private int size;  
          
        public LRU() {  
        }  
        /** 
         * �ж��ڴ����Ƿ�Ϊ�� 
         * @return 
         */  
        public boolean isEmpty() {  
            if(size == 0) {  
                return true;  
            } else {  
                return false;  
            }  
        }  
        /** 
         * �ж��ڴ����Ƿ�ﵽ���ֵ 
         * @return 
         */  
        public boolean isOutOfBoundary() {  
            if(size >=N) {  
                return true;  
            } else {  
                return false;  
            }  
        }  
        /** 
         * ����Ԫ��o�������е�λ�� 
         * @param o 
         * @return 
         */  
        public int indexOfElement(Object o) {  
            for(int i=0; i<N; i++) {   
                if(o == array[i]) {  
                    return i;  
                }  
            }  
            return -1;  
        }     
        /** 
         * ���µ�����o��Ҫ�����ڴ� 
         * @param o 
         * @return �Ƴ��ڴ��������� 
         */  
        public Object push(Object o) { 
            int t = -1;  
            if(!isOutOfBoundary() && indexOfElement(o) == -1){
            	//���Ƿ���ȱҳ�жϣ�����û�����ռ�
                array[size] = o;  
                size ++;  
            } else if(isOutOfBoundary() && indexOfElement(o) == -1){
            	//�������ȱҳ�жϣ����ҿռ����ˡ�
                for(int i=0; i<size-1; i++) {  
                    array[i] = array[i+1];                
                }//������ͷ�ڵ�ĸ�ȥ��  
                array[size-1] = o;//���µ�ҳ��������ĩ��  
            } else {  
                t = indexOfElement(o); //����t��λ�� 
                for(int i=t; i<size-1; i++) {  
                    array[i] = array[i+1]; 
                }  
                array[size-1] = o;  
            }  
            if( -1 == t) {  
                return null;  
            } else {  
                return array[t];  
            }  
        }  
        /** 
         * ����ڴ����еĸ����� 
         */  
        public void showMemoryBlock() {  
            for(int i=0; i<size; i++) {  
                System.out.print(array[i] + "\t");  
            }  
        }  
      
        /** 
         * @param args 
         */  
        public static void main(String[] args) {  
            Integer iter[] = {4,7,0,7,1,0,1,2,1,2,6};  
            LRU lru = new LRU();  
            for(int i=0; i<iter.length; i++) {  
                lru.push(iter[i]);  
                lru.showMemoryBlock();  
                System.out.println();  
            }  
        }  
      
    }  