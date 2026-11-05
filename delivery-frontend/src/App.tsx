import { useEffect, useState } from 'react'
import request from './utils/request'

// 1. 定义 TypeScript 的接口（对应后端的 User 实体类）
interface User {
  id: number
  username: string
  phone: string
  avatar: string
}

function App() {
  // 2. 定义状态，用来存放后端返回的用户列表
  const [users, setUsers] = useState<User[]>([])

  // 3. useEffect 是 React 的生命周期钩子，页面加载时自动执行
  useEffect(() => {
    // 4. 发送 GET 请求。注意：因为 request.ts 里配了 baseURL: '/api'
    // 所以这里直接写 '/users/list' 即可，Vite 会代理到 8080 端口
    request.get('/users/list').then((res: any) => {
      console.log('后端返回的数据：', res)
      setUsers(res) // 把数据存入状态
    })
  }, [])

  // 5. 渲染页面
  return (
    <div style={{ padding: '40px' }}>
      <h1>外卖平台用户列表</h1>
      {users.map(user => (
        <div key={user.id} style={{ border: '1px solid #ccc', margin: '10px 0', padding: '10px' }}>
          <h3>{user.username}</h3>
          <p>手机号：{user.phone}</p>
        </div>
      ))}
    </div>
  )
}

export default App